package constants;


import java.util.Properties;

/**
 * @author steven
 */
//RPC常数类  因为@Value无法注入静态变量所以就采用直接赋值
public class RpcConstants {
    //zookeeper服务器连接地址
    public final static String ZOOKEEPER_ADDRESS = "zytCentos:2181";
    //超时时间
    public final static int ZOOKEEPER_SESSION_TIMEOUT = 2000;

}
