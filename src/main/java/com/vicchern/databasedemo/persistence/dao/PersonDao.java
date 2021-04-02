package com.vicchern.databasedemo.persistence.dao;

import com.vicchern.databasedemo.persistence.entity.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();

    Person findById(int id);

    Integer deleteById(int id);

    void updatePerson(Person person);

    void insertPerson(Person person);
}
