package consumer.proxy;

//模板

/**
 * @author steven
 */
public interface ClientProxy {
    Object getBean(final Class<?> serviceClass);
}
