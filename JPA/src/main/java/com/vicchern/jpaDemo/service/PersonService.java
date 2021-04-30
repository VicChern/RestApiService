package com.vicchern.jpaDemo.service;


import com.vicchern.jpaDemo.entity.Person;

import java.util.List;

public interface PersonService {

     Person findById(int id);

     List<Person> findAll();

     void removePerson(Person person);

     void updatePerson(Person person);

     void insertPerson(Person person);
}
