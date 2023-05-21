package consumer.bootstrap.nio;


import consumer.proxy.ClientProxyTool;
import method.Customer;

/*
    以nio为网络编程框架的消费者端启动类   配合15的集体启动类
 */

/**
 * @author steven
 */
public class NIOConsumerBootStrap15 {
    public static Customer main(String[] args) {
        ClientProxyTool proxy = new ClientProxyTool();
        return (Customer) proxy.getBean(Customer.class);
    }
}
