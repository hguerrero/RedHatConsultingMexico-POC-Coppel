package mx.com.redhat.consulting.coppel.poc;

import org.apache.camel.AsyncCallback;
import org.apache.camel.CamelExchangeException;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.component.netty.NettyCamelState;
import org.apache.camel.component.netty.NettyConstants;
import org.apache.camel.component.netty.NettyHelper;
import org.apache.camel.component.netty.NettyPayloadHelper;
import org.apache.camel.component.netty.NettyProducer;
import org.apache.camel.util.ExchangeHelper;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoppelClientHandler extends SimpleChannelUpstreamHandler {

    // use NettyProducer as logger to make it easier to read the logs as this is part of the producer
    private static final Logger LOG = LoggerFactory.getLogger(CoppelClientHandler.class);
    private final NettyProducer producer;
    private volatile boolean messageReceived;
    private volatile boolean exceptionHandled;

    
    private boolean firstMessage;
	private boolean handShakeFlag;
	private int totalSize;
	private boolean responseFlag;
	private int countPackages = 1;
	private int packageSizeReversed;
	private StringBuilder message = new StringBuilder();
	
	private final int PACKAGE_SIZE = 196;
	
	
    public CoppelClientHandler(NettyProducer producer) {
        this.producer = producer;
    }
    
    
    @Override
    public void channelOpen(ChannelHandlerContext ctx, ChannelStateEvent channelStateEvent) throws Exception {
        if (LOG.isTraceEnabled()) {
            LOG.trace("Channel open: {}", ctx.getChannel());
        }
        // to keep track of open sockets
        producer.getAllChannels().add(channelStateEvent.getChannel());
        // make sure the event can be processed by other handlers
        super.channelOpen(ctx, channelStateEvent);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent exceptionEvent) throws Exception {
        if (LOG.isTraceEnabled()) {
            LOG.trace("Exception caught at Channel: " + ctx.getChannel(), exceptionEvent.getCause());
        }
         
        if (exceptionHandled) {
            // ignore subsequent exceptions being thrown
            return;
        }

        exceptionHandled = true;
        Throwable cause = exceptionEvent.getCause();

        if (LOG.isDebugEnabled()) {
            LOG.debug("Closing channel as an exception was thrown from Netty", cause);
        }

        Exchange exchange = getExchange(ctx);
        AsyncCallback callback = getAsyncCallback(ctx);

        // the state may not be set
        if (exchange != null && callback != null) {
            // set the cause on the exchange
            exchange.setException(cause);

            // close channel in case an exception was thrown
            NettyHelper.close(exceptionEvent.getChannel());

            // signal callback
            callback.done(false);
        }
    }

    @Override
    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        if (LOG.isTraceEnabled()) {
            LOG.trace("Channel closed: {}", ctx.getChannel());
        }

        Exchange exchange = getExchange(ctx);
        AsyncCallback callback = getAsyncCallback(ctx);

        // remove state
        producer.removeState(ctx.getChannel());

        // to keep track of open sockets
        producer.getAllChannels().remove(ctx.getChannel());

        if (producer.getConfiguration().isSync() && !messageReceived && !exceptionHandled) {
            // To avoid call the callback.done twice 
            exceptionHandled = true;
            // session was closed but no message received. This could be because the remote server had an internal error
            // and could not return a response. We should count down to stop waiting for a response
            if (LOG.isDebugEnabled()) {
                LOG.debug("Channel closed but no message received from address: {}", producer.getConfiguration().getAddress());
            }
            exchange.setException(new CamelExchangeException("No response received from remote server: " + producer.getConfiguration().getAddress(), exchange));
            // signal callback
            callback.done(false);
        }
        // make sure the event can be processed by other handlers
        super.channelClosed(ctx, e);
    }

    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent messageEvent) throws Exception {
        messageReceived = true;
        
		ChannelBuffer buffer = (ChannelBuffer) messageEvent.getMessage();
		if (!buffer.readable()) {
			return;
		}

		if(!firstMessage) {
			firstMessage = true;
	        Exchange exchange = this.getExchange(ctx);
	        message.append(exchange.getProperty("CoppelMessage"));
	        LOG.info("Entre al firstMessage");
		}
		
		if(!responseFlag) {
			int sizeAknowledge = buffer.readInt();
			LOG.info("Acuse recibido: " + reverseInteger(sizeAknowledge));
			LOG.info("Longitud de la cadena: " + message.length());
			if(message.length() > 0) {
				int tamanoPackage = PACKAGE_SIZE;
				if(message.length() < PACKAGE_SIZE) {
					tamanoPackage = message.length();
					LOG.info("El tamano del buffer es menor al predeterminado: " + tamanoPackage);
				}
				
				String bodyPackage = message.toString().substring(0, tamanoPackage);
				message.delete(0, tamanoPackage);
				LOG.info("Paquete S " + countPackages + " size: " + tamanoPackage + " body: " + bodyPackage);
				buffer = ChannelBuffers.buffer(4 + tamanoPackage);
				buffer.writeInt(reverseInteger(tamanoPackage));
				buffer.writeBytes(bodyPackage.getBytes());
				ctx.getChannel().write(buffer);
				countPackages++;
				return;
			} else {
				responseFlag = true;
			}
		} else {
			if (!handShakeFlag) {
				message.delete(0, message.length());
				int totalSizeReversed = buffer.readInt();
				totalSize = reverseInteger(totalSizeReversed);
				LOG.info("Total Size received: " + totalSize);
				handShakeFlag = true;
				countPackages = 1;
				buffer = ChannelBuffers.buffer(4);
				buffer.writeInt(totalSizeReversed);
				ctx.getChannel().write(buffer);
				return;
			}
			packageSizeReversed = buffer.readInt();
			LOG.info("PackageR " + countPackages + " size: " + reverseInteger(packageSizeReversed));

			LOG.info("Entrado para obtener el body del paquete");
			String bodyPackage = new String(buffer.readBytes(reverseInteger(packageSizeReversed)).array());
			LOG.info("PackageR " + countPackages + " size: " + reverseInteger(packageSizeReversed) + "; body: " + bodyPackage);
			message.append(bodyPackage);
			countPackages++;
			ChannelBuffer bufferWriter = ChannelBuffers.buffer(4);
			bufferWriter.writeInt(packageSizeReversed);
			ctx.getChannel().write(bufferWriter);
			if(message.length() == totalSize) {
				AsyncCallback callback = getAsyncCallback(ctx);
				
				String bodyMessage = message.toString();
				Exchange exchange = getExchange(ctx);
		        try {
		            if (ExchangeHelper.isOutCapable(exchange)) {
		                NettyPayloadHelper.setOut(exchange, bodyMessage);
		            } else {
		                NettyPayloadHelper.setIn(exchange, bodyMessage);
		            }
		        } catch (Exception e) {
		            exchange.setException(e);
		            callback.done(false);
		            return;
		        }
		        try {
		            // should channel be closed after complete?
		            Boolean close;
		            if (ExchangeHelper.isOutCapable(exchange)) {
		                close = exchange.getOut().getHeader(NettyConstants.NETTY_CLOSE_CHANNEL_WHEN_COMPLETE, Boolean.class);
		            } else {
		                close = exchange.getIn().getHeader(NettyConstants.NETTY_CLOSE_CHANNEL_WHEN_COMPLETE, Boolean.class);
		            }
		            
		            // check the setting on the exchange property
		            if (close == null) {
		                close = exchange.getProperty(NettyConstants.NETTY_CLOSE_CHANNEL_WHEN_COMPLETE, Boolean.class);
		            }
		            
		            // should we disconnect, the header can override the configuration
		            boolean disconnect = producer.getConfiguration().isDisconnect();
		            if (close != null) {
		                disconnect = close;
		            }
		            if (disconnect) {
		                if (LOG.isTraceEnabled()) {
		                    LOG.trace("Closing channel when complete at address: {}", producer.getConfiguration().getAddress());
		                }
		                NettyHelper.close(ctx.getChannel());
		            }
		        } finally {
		            // signal callback
		            callback.done(false);
		        }
			}
		}
    }

    protected Message getResponseMessage(Exchange exchange, MessageEvent messageEvent) throws Exception {
        Object body = messageEvent.getMessage();
        if (LOG.isDebugEnabled()) {
            LOG.debug("Channel: {} received body: {}", new Object[]{messageEvent.getChannel(), body});
        }

        // if textline enabled then covert to a String which must be used for textline
        if (producer.getConfiguration().isTextline()) {
            body = producer.getContext().getTypeConverter().mandatoryConvertTo(String.class, exchange, body);
        }

        // set the result on either IN or OUT on the original exchange depending on its pattern
        if (ExchangeHelper.isOutCapable(exchange)) {
            NettyPayloadHelper.setOut(exchange, body);
            return exchange.getOut();
        } else {
            NettyPayloadHelper.setIn(exchange, body);
            return exchange.getIn();
        }
    }

    protected Exchange getExchange(ChannelHandlerContext ctx) {
        NettyCamelState state = producer.getState(ctx.getChannel());
        return state != null ? state.getExchange() : null;
    }

    private AsyncCallback getAsyncCallback(ChannelHandlerContext ctx) {
        NettyCamelState state = producer.getState(ctx.getChannel());
        return state != null ? state.getCallback() : null;
    }
	
	private int reverseInteger(int input) {
		return (input >>> 24) | (input >> 8) & 0x0000ff00 | (input << 8) & 0x00ff0000 | (input << 24);
	}
}
