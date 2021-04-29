package com.vicchern.jpaDemo.repository;

import com.vicchern.jpaDemo.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository {

    Person findById(int id);

//    List<Person> findAll();
//
//    Integer deleteById(int id);
//
//    void updatePerson(Person person);
//
//    void insertPerson(Person person);
}
