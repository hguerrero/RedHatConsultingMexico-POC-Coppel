package mx.com.redhat.consulting.coppel.poc;

import org.apache.camel.component.netty.ClientPipelineFactory;
import org.apache.camel.component.netty.NettyProducer;
import org.jboss.netty.channel.ChannelHandler;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.Channels;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoppelClientPipelineFactory extends ClientPipelineFactory  {
    private static final Logger LOG = LoggerFactory.getLogger(CoppelClientPipelineFactory.class);

    private NettyProducer producer;
    
    public CoppelClientPipelineFactory() {
    	super();
    	LOG.info("Construyendo: CoppelClientPipelineFactory");
    }

    public CoppelClientPipelineFactory(NettyProducer producer) {
        this.producer = producer;
    }

    @Override
    public ChannelPipeline getPipeline() throws Exception {
        ChannelPipeline channelPipeline = Channels.pipeline();
        addToPipeline("handler", channelPipeline, new CoppelClientHandler(producer));
        return channelPipeline;
    }

    private void addToPipeline(String name, ChannelPipeline pipeline, ChannelHandler handler) {
        pipeline.addLast(name, handler);
    }

    @Override
    public ClientPipelineFactory createPipelineFactory(NettyProducer producer) {
        return new CoppelClientPipelineFactory(producer);
    }
}
