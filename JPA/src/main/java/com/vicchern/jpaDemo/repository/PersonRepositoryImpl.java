package com.vicchern.jpaDemo.repository;

import com.vicchern.jpaDemo.entity.Person;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository{

    @PersistenceContext
    private EntityManager entityManager;

//    @Override
//    public List<Person> findAll() {
//        String sql = "select * from person";
//        return entityManager.query(sql, new PersonRowMapper());
//    }

    @Override
    public Person findById(int id) {
        return entityManager.find(Person.class,id);
    }


//    @Override
//    public Integer deleteById(int id) {
//        String sql = "delete from person where id = ?";
//        return  entityManager.update(sql, id);
//    }
//
//    @Override
//    public void updatePerson(Person person) {
//        String sql = "update person set name = ?, location = ? where id = ?";
//        entityManager.update(sql, person.getName(), person.getLocation(),person.getId());
//    }
//
//    @Override
//    public void insertPerson(Person person) {
//        String sql = "insert into person (name,location,birth_date) values(?,?,?)";
//        entityManager.update(sql, person.getName(),person.getLocation(),person.getBirthDate());
//    }
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
