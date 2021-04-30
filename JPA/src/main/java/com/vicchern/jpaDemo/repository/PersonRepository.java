package com.vicchern.jpaDemo.repository;

import com.vicchern.jpaDemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

public interface PersonRepository {

    Person findById(int id);

    List<Person> findAll();

    void removePerson(Person person);
//
    void updatePerson(Person person);

    void insertPerson(Person person);
}
