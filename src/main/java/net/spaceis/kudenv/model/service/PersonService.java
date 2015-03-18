package net.spaceis.kudenv.model.service;

import java.util.Set;
import net.spaceis.kudenv.domain.Person;
/**
 * Business Methods for the Service
 */
public interface PersonService {

    void insertPerson(Person person);

    Person getPersonById(String id);
    Set<Person> getAllPerson();

    Person updatePerson(Person person);

    void deletePersonById(String id);
}
