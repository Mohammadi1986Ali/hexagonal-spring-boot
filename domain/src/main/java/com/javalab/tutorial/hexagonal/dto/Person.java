package com.javalab.tutorial.hexagonal.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private Long id;
    private String name;
    private String family;
}
