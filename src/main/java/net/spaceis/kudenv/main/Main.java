package net.spaceis.kudenv.main;

import net.spaceis.kudenv.configuration.SpringFrameworkJavaConfiguration;
import net.spaceis.kudenv.domain.Person;
import net.spaceis.kudenv.model.repository.PersonRepository;
import net.spaceis.kudenv.model.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Simple Main Class
 */
@SuppressWarnings("unused")
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String classpath ="central-xml.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(classpath);
        //ApplicationContext context = new AnnotationConfigApplicationContext();

        //((AnnotationConfigApplicationContext) context).register(SpringFrameworkJavaConfiguration.class);
        //((AnnotationConfigApplicationContext) context).refresh();

        Person person = new Person();
        person.setId("001");
        person.setFirstName("manuel");
        person.setLastName("jordan");

        PersonRepository personRepository = context.getBean(PersonRepository.class);
        PersonService personService = context.getBean(PersonService.class);

        logger.info("Insering Person");
        personService.insertPerson(person);

        logger.info("Retrieving all Persons");
        logger.info("{}", personService.getAllPerson().toString());


    }
}
