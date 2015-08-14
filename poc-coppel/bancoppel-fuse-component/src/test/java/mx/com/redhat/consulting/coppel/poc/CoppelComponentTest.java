package mx.com.redhat.consulting.coppel.poc;

import org.apache.camel.test.junit4.CamelTestSupport;

public class CoppelComponentTest extends CamelTestSupport {

//    @Test
//    public void testCoppel() throws Exception {
//        MockEndpoint mock = getMockEndpoint("mock:result");
//        mock.expectedMinimumMessageCount(1);
//        
//        assertMockEndpointsSatisfied();
//    }
//
//    @Override
//    protected RouteBuilder createRouteBuilder() throws Exception {
//        return new RouteBuilder() {
//            public void configure() {
//                from("netty:tcp://127.0.0.1:22007?sync=true&synchronous=true&serverPipelineFactory=#spf")
//                .log("${body}")
//                .to("mock:result");
//            }
//        };
//    }
}
