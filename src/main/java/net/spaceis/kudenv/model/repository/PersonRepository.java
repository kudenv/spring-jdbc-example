package net.spaceis.kudenv.model.repository;


import java.util.Set;
import net.spaceis.kudenv.domain.Person;
/**
 * Persistent Methods for Repository
 */
public  interface PersonRepository {
    void insertPerson(Person person);
    Person getPerson(String id);
    Set<Person> getAllPerson();
    Person updatePerson(Person person);
    void deletePerson(String id);

}
