package mx.com.redhat.consulting.coppel.poc;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.jboss.netty.buffer.ChannelBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoppelInputProcessor implements Processor {
	private static final Logger LOG = LoggerFactory.getLogger(CoppelInputProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		ChannelBuffer buffer = (ChannelBuffer) exchange.getIn().getBody();
		String message = new String(buffer.array());
		LOG.info("Body=" + message);
		exchange.getOut().setBody(message);
	}

}