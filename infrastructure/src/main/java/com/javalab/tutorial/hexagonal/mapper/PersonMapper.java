package com.javalab.tutorial.hexagonal.mapper;

import com.javalab.tutorial.hexagonal.dto.Person;
import com.javalab.tutorial.hexagonal.entity.PersonEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    Person map(PersonEntity personEntity);
    PersonEntity map(Person person);
    List<Person> map(List<PersonEntity> personEntities);
}
