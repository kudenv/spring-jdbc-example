package net.spaceis.kudenv.model.repository.custom;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.spaceis.kudenv.domain.Person;
import net.spaceis.kudenv.model.repository.PersonRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository class
 * Does than not exist a real interaction with a Database
 */
//@Repository
public class PersonCustomRepository implements PersonRepository{

    private static final Logger logger = LoggerFactory.getLogger(PersonCustomRepository.class);

    private Map<String, Person> personMap;

    public PersonCustomRepository() {
        logger.info("PersonCustomRepository no-arg constructor");
        personMap = new HashMap<String, Person>();
    }

    @Override
    public void insertPerson(Person person) {
        personMap.put(person.getId(), person);
    }

    @Override
    public Person getPerson(String id) {
        return personMap.get(id);
    }

    @Override
    public Set<Person> getAllPerson() {
        return new LinkedHashSet<Person>(personMap.values());
    }

    @Override
    public Person updatePerson(Person person) {
        personMap.put(person.getId(), person);
        return person;
    }

    @Override
    public void deletePerson(String id) {
            personMap.remove(id);
    }
}
