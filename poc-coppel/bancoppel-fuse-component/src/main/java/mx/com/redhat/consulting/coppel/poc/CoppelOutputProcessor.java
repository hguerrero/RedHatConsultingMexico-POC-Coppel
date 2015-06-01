package mx.com.redhat.consulting.coppel.poc;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoppelOutputProcessor implements Processor {
	private static final Logger LOG = LoggerFactory.getLogger(CoppelOutputProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		String messageIn = (String) exchange.getIn().getBody();
		ChannelBuffer buffer = ChannelBuffers.buffer(4);
		buffer.writeInt(reverseInteger(messageIn.length()));
		exchange.setProperty("CoppelMessage", messageIn);
		LOG.info("Body=" + messageIn);
		exchange.getOut().setBody(buffer);
	}
	
	private int reverseInteger(int input) {
		return (input >>> 24) | (input >> 8) & 0x0000ff00 | (input << 8) & 0x00ff0000 | (input << 24);
	}

}
