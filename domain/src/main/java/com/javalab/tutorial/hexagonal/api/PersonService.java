package com.javalab.tutorial.hexagonal.api;

import com.javalab.tutorial.hexagonal.dto.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person addPerson(Person person);
    void deletePerson(Long id);
    Person updatePerson(Person person);
    List<Person> getPersons();
    Optional<Person> getPersonById(Long id);
}
