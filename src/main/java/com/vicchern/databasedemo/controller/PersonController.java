package com.vicchern.databasedemo.controller;

import com.vicchern.databasedemo.persistence.entity.Person;
import com.vicchern.databasedemo.persistence.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(path = "/")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping(path = "/findAll")
    public List<Person> findAllPersons(){
          return personService.findAll();
    }
}
