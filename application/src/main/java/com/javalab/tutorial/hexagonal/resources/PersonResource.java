package com.javalab.tutorial.hexagonal.resources;

import com.javalab.tutorial.hexagonal.api.PersonService;
import com.javalab.tutorial.hexagonal.mapper.PersonModelMapper;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResource {

    private final PersonService service;
    private final PersonModelMapper mapper;

    public PersonResource(PersonService service, PersonModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
}
