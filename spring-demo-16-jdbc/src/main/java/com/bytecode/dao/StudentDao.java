package com.bytecode.dao;

import java.util.List;

import com.bytecode.entity.Student;

public interface StudentDao {
	int insertStudent(Student s);

	Student fetchStudentById(int id);

	List<Student> fetchAllStudent();
}
