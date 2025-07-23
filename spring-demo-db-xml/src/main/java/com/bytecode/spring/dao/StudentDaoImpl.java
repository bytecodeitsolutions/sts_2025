package com.bytecode.spring.dao;

import com.bytecode.spring.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
    private JdbcTemplate jdbcTemplate;

    // setter for injection
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Student student) {
        String query = "INSERT INTO STUDENT (ID, NAME, AGE) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, student.getId(), student.getName(), student.getAge());
    }
}
