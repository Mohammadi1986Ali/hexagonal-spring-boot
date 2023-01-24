package com.javalab.tutorial.hexagonal.service;

import com.javalab.tutorial.hexagonal.api.PersonService;
import com.javalab.tutorial.hexagonal.dto.Person;
import com.javalab.tutorial.hexagonal.spi.PersonPersistence;

import java.util.List;
import java.util.Optional;

public class PersonServiceImpl implements PersonService {

    private final PersonPersistence persistence;

    public PersonServiceImpl(PersonPersistence persistence) {
        this.persistence = persistence;
    }

    @Override
    public Person addPerson(Person person) {
        return persistence.addPerson(person);
    }

    @Override
    public void deletePerson(Long id) {
        persistence.deletePerson(id);
    }

    @Override
    public Person updatePerson(Person person) {
        return persistence.updatePerson(person);
    }

    @Override
    public List<Person> getPersons() {
        return persistence.getPersons();
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return persistence.getPersonById(id);
    }
}
