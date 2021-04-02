package com.vicchern.databasedemo.persistence.service;

import com.vicchern.databasedemo.persistence.dao.PersonDao;
import com.vicchern.databasedemo.persistence.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Person findById(int id) {
        return personDao.findById(id);
    }

    @Override
    public Integer deleteById(int id) {
        return personDao.deleteById(id);
    }

    @Override
    public void updatePerson(Person person) {
        personDao.updatePerson(person);
    }

    @Override
    public void insertPerson(Person person) {
        personDao.insertPerson(person);
    }
}
