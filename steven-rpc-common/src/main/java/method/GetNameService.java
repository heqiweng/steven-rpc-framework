package method;

import entity.Person;
import entity.PersonPOJO;

/**
 * @author steven
 */
public interface GetNameService {
    String sayGetName(Person person);

    String sayGetName(PersonPOJO.Person person);
}
