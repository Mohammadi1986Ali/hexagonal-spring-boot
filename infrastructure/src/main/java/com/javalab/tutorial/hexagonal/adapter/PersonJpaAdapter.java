package com.javalab.tutorial.hexagonal.adapter;

import com.javalab.tutorial.hexagonal.dto.Person;
import com.javalab.tutorial.hexagonal.entity.PersonEntity;
import com.javalab.tutorial.hexagonal.mapper.PersonMapper;
import com.javalab.tutorial.hexagonal.repository.PersonRepository;
import com.javalab.tutorial.hexagonal.spi.PersonPersistence;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonJpaAdapter implements PersonPersistence {

    private final PersonMapper mapper;
    private final PersonRepository repository;

    public PersonJpaAdapter(PersonMapper mapper, PersonRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public Person addPerson(Person person) {
        PersonEntity savedPerson = repository.save(mapper.map(person));
        return mapper.map(savedPerson);
    }

    @Override
    public void deletePerson(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Person updatePerson(Person person) {
        PersonEntity updatedPerson = repository.save(mapper.map(person));
        return mapper.map(updatedPerson);
    }

    @Override
    public List<Person> getPersons() {
        return mapper.map(repository.findAll());
    }

    @Override
    public Optional<Person> getPersonById(Long id) {
        return repository.findById(id).map(mapper::map);
    }
}
