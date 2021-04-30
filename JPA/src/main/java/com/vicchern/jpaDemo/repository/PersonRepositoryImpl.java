package com.vicchern.jpaDemo.repository;

import com.vicchern.jpaDemo.entity.Person;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Repository
@Transactional
public class PersonRepositoryImpl implements PersonRepository{

    @PersistenceContext
    private EntityManager entityManager;

//    @Override
//    public List<Person> findAll() {
//        String sql = "select * from person";
//        return entityManager.query(sql, new PersonRowMapper());
//    }

    @Override
    public List<Person> findAll() {
        TypedQuery<Person> typedQuery = entityManager.createNamedQuery("find_persons",Person.class);
        return typedQuery.getResultList();
    }

    @Override
    public Person findById(int id) {
        return entityManager.find(Person.class,id);
    }


    @Override
    public void removePerson(Person person) {
        entityManager.remove(entityManager.contains(person) ? person : entityManager.merge(person));
    }

    @Override
    public void updatePerson(Person person) {
        entityManager.merge(person);
    }

    @Override
    public void insertPerson(Person person) {
        entityManager.merge(person);
    }
//
//    static class PersonRowMapper implements RowMapper<Person>{
//
//        @Override
//        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
//            Person person = new Person();
//            person.setId(rs.getInt("id"));
//            person.setName(rs.getString("name"));
//            person.setLocation(rs.getString("location"));
//            person.setBirthDate(rs.getDate("birth_date"));
//            return person;
//        }
//    }
}
