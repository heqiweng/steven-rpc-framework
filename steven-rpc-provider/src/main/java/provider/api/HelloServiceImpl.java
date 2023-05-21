package provider.api;

import method.HelloService;

/**
 * @author steven
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String saying) {
        return "Hello," + saying;
    }
}
