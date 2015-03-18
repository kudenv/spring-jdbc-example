package net.spaceis.kudenv.model.service.impl;

import net.spaceis.kudenv.domain.Person;
import net.spaceis.kudenv.model.repository.PersonRepository;
import net.spaceis.kudenv.model.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;
import java.util.Set;

/**
 * Service class working with Repository
 */

@Transactional
@Service
public class PersonServiceImlVersion01 implements PersonService {

    private static final Logger logger = LoggerFactory.getLogger(PersonServiceImlVersion01.class);

    private PersonRepository personRepository;

    public PersonServiceImlVersion01() {
        logger.info("PersonServiceImplVersion01 no-arg constructor");
    }

    @Autowired
    public PersonServiceImlVersion01(PersonRepository personRepository) {
        logger.info("PersonServiceImplVersion01 arg constructor");
        this.personRepository = personRepository;
    }

    @Override
    public void insertPerson(Person person) {
        this.personRepository.insertPerson(person);
    }

    @Override
    public Person getPersonById(String id) {
        return this.personRepository.getPerson(id);
    }

    @Override
    public Set<Person> getAllPerson() {
        return this.personRepository.getAllPerson();
    }

    @Override
    public Person updatePerson(Person person) {
        return this.personRepository.updatePerson(person);
    }

    @Override
    public void deletePersonById(String id) {
        this.personRepository.deletePerson(id);
    }
}
