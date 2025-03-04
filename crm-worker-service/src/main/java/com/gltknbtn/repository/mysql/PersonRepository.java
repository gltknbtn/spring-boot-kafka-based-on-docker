package com.gltknbtn.repository.mysql;

import com.gltknbtn.model.mysql.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called personRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findByName(String name);
}