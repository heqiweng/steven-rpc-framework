package provider.api;

import method.ByeService;

/**
 * @author steven
 */
public class ByeServiceImpl implements ByeService {
    @Override
    public String sayBye(String saying) {
        return "Bye," + saying;
    }
}
