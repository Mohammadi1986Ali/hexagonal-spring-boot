package com.javalab.tutorial.hexagonal.mapper;

import com.javalab.tutorial.hexagonal.dto.Person;
import com.javalab.tutorial.hexagonal.model.PersonModel;
import org.mapstruct.Mapper;

@Mapper
public interface PersonModelMapper {
    Person map(PersonModel personModel);
    PersonModel map (Person person);
}
