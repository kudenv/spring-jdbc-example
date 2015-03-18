package net.spaceis.kudenv.model.repository.custom;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import net.spaceis.kudenv.model.repository.PersonRepository;
import net.spaceis.kudenv.model.repository.jdbc.PersonJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by kudenv on 3/15/15.
 */

//@Configuration
public class ModelRepositoryCustomConfiguration {

  //  @Bean
//    public PersonRepository personRepository(JdbcTemplate jdbc){
//        return new PersonJdbcRepository(jdbc);
//    }
}
