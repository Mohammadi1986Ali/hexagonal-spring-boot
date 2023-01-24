package com.javalab.tutorial.hexagonal.repository;

import com.javalab.tutorial.hexagonal.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
