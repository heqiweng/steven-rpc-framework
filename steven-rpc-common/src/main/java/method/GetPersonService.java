package method;

import entity.Person;
import entity.PersonPOJO;

/**
 * @author steven
 */
public interface GetPersonService {
    Person sayGetPerson(Person person);

    //protobuf
    PersonPOJO.Person sayGetPerson(PersonPOJO.Person person);
}
