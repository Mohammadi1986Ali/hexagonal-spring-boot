package com.javalab.tutorial.hexagonal.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonModel {
    private Long id;
    private String name;
    private String family;
}
