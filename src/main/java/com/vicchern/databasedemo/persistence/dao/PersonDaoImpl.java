package com.vicchern.databasedemo.persistence.dao;

import com.vicchern.databasedemo.persistence.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Person> findAll() {
        String sql = "select * from person";
        return jdbcTemplate.query(sql, new PersonRowMapper());
    }

    @Override
    public Person findById(int id) {
        String sql = "select * from person where id = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{id},new PersonRowMapper());
    }

    @Override
    public Integer deleteById(int id) {
        String sql = "delete from person where id = ?";
        return  jdbcTemplate.update(sql, id);
    }

    @Override
    public void updatePerson(Person person) {
        String sql = "update person set name = ?, location = ? where id = ?";
        jdbcTemplate.update(sql, person.getName(), person.getLocation(),person.getId());
    }

    @Override
    public void insertPerson(Person person) {
        String sql = "insert into person (name,location,birth_date) values(?,?,?)";
        jdbcTemplate.update(sql, person.getName(),person.getLocation(),person.getBirthDate());
    }

    static class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getDate("birth_date"));
            return person;
        }
    }
}
