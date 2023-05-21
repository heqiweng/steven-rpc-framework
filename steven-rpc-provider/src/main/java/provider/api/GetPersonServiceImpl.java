package provider.api;

import entity.Person;
import entity.PersonPOJO;
import method.GetPersonService;

/**
 * @author steven
 */
public class GetPersonServiceImpl implements GetPersonService {
    @Override
    public Person sayGetPerson(Person person) {
        return person;
    }

    //protobuf
    @Override
    public PersonPOJO.Person sayGetPerson(PersonPOJO.Person person) {
        return person;
    }
}
