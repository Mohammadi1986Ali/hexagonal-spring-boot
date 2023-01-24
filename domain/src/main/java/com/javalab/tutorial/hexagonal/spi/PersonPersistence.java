package com.javalab.tutorial.hexagonal.spi;

import com.javalab.tutorial.hexagonal.dto.Person;

import java.util.List;
import java.util.Optional;

public interface PersonPersistence {

    Person addPerson(Person person);
    void deletePerson(Long id);
    Person updatePerson(Person person);
    List<Person> getPersons();
    Optional<Person> getPersonById(Long id);
}
