package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Person person) {
        personRepository.save(person);
    }

    @RequestMapping(value = "person/{id}")
    public Person read(@PathVariable long id) {
        return personRepository.findOne(id);
    }

    @RequestMapping(value = "person", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Person person) {
        personRepository.save(person);
    }

    @RequestMapping(value = "person/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id) {
        personRepository.delete(id);
    }
}
