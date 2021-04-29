package com.vicchern.jpaDemo.service;
import com.vicchern.jpaDemo.entity.Person;
import com.vicchern.jpaDemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

//    @Override
//    public List<Person> findAll() {
//        return personRepository.findAll();
//    }

    @Override
    public Person findById(int id) {
        return personRepository.findById(id);
    }

//    @Override
//    public Integer deleteById(int id) {
//        return personRepository.deleteById(id);
//    }
//
//    @Override
//    public void updatePerson(Person person) {
//        personRepository.updatePerson(person);
//    }
//
//    @Override
//    public void insertPerson(Person person) {
//        personRepository.insertPerson(person);
//    }
}
