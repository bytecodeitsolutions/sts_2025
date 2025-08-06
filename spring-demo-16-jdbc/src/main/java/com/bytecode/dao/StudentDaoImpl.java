package com.bytecode.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bytecode.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertStudent(Student s) {
		String sql = "INSERT INTO student (id, name, age, address) VALUES (?, ?, ?, ?)";
		return jdbcTemplate.update(sql, s.getId(), s.getName(), s.getAge(), s.getAddress());
	}

	@Override
	public Student fetchStudentById(int id) {

		return null;
	}

	@Override
	public List<Student> fetchAllStudent() {

		return null;
	}

}
