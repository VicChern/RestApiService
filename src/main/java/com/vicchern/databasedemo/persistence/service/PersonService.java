package com.vicchern.databasedemo.persistence.service;

import com.vicchern.databasedemo.persistence.entity.Person;

import java.util.List;

public interface PersonService {

     List<Person> findAll();

     Person findById(int id);

     Integer deleteById(int id);

     void updatePerson(Person person);

     void insertPerson(Person person);
}
