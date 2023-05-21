package consumer.proxy;


import java.util.Objects;

/**
 * @author steven
 */
public class ClientProxyTool implements ClientProxy {
    @Override
    public Object getBean(Class<?> serviceClass) {
        return Objects.requireNonNull(SPIClientProxyUtils.getUtils()).getBean(serviceClass);
    }
}
