package net.spaceis.kudenv.model.repository.jdbc.support;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import net.spaceis.kudenv.domain.Person;

/**
 * Custom RowMapper implementation for the Person Domain class
 */

public class PersonRowMapper implements RowMapper<Person>{


    @Override
    public Person mapRow(ResultSet rs, int i) throws SQLException {

        Person person = new Person();
        person.setId(rs.getString("id"));
        person.setFirstName(rs.getString("firstname"));
        person.setLastName("lastname");

        return person;
    }
}
