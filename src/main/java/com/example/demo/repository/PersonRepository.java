package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByCreatedDate(Date createdDate);
    List<Person> findByFirstName(String firstName);
}
