package com.javalab.tutorial.hexagonal.config;

import com.javalab.tutorial.hexagonal.api.PersonService;
import com.javalab.tutorial.hexagonal.service.PersonServiceImpl;
import com.javalab.tutorial.hexagonal.spi.PersonPersistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    private final PersonPersistence persistence;

    public PersonConfig(PersonPersistence persistence) {
        this.persistence = persistence;
    }

    @Bean
    PersonService personService() {
        return new PersonServiceImpl(persistence);
    }
}
