package consumer.bootstrap.netty;


import consumer.proxy.ClientProxyTool;
import method.Customer;

/*
    以netty为网络编程框架的消费者端启动类
 */
//进行启动 提供类的方式即可

/**
 * @author steven
 */
public class NettyConsumerBootStrap24 {
    public static Customer main() {
        ClientProxyTool proxy = new ClientProxyTool();
        return (Customer) proxy.getBean(Customer.class);
    }
}