package net.spaceis.kudenv.model.repository.jdbc;

import net.spaceis.kudenv.domain.Person;
import net.spaceis.kudenv.model.repository.PersonRepository;
import net.spaceis.kudenv.model.repository.jdbc.support.PersonRowMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Repository class working wth a Persistent Mechanism
 */
@Transactional
@Repository()
public class PersonJdbcRepository implements PersonRepository {

    private static final Logger logger = LoggerFactory.getLogger(PersonJdbcRepository.class);


    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonJdbcRepository(JdbcTemplate jdbcTemplate) {
        logger.info("PersonJdbcRepository arg constructor");
        this.jdbcTemplate = jdbcTemplate;

    }

    @Override
    public void insertPerson(Person person) {
        String sql = "INSERT INTO person(id, firstName, lastName) VALUES(?,?,?)";
        this.jdbcTemplate.update(sql, person.getId(), person.getFirstName(),person.getLastName());

    }

    @Override
    public Person getPerson(String id) {
        String sql  = "SELECT p.* FROM person p WHERE p.id=?";
        return this.jdbcTemplate.queryForObject(sql,new PersonRowMapper(),id);
    }

    @Override
    public Set<Person> getAllPerson() {
        String sql  = "SELECT p.* FROM person p";
        return new LinkedHashSet<Person>(this.jdbcTemplate.query(sql, new PersonRowMapper()));
    }

    @Override
    public Person updatePerson(Person person) {
        String sql = "UPDATE person p SET p.id=?, p.firstName=?, p.lastName=? WHERE p.id=?";
        this.jdbcTemplate.update(sql,person.getFirstName(),person.getLastName(),person.getId());
        return person;
    }

    @Override
    public void deletePerson(String id) {
        String sql ="DELETE FROM person WHERE id=?";
        this.jdbcTemplate.update(sql,id);

    }
}
