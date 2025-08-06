package com.bytecode.service;

import com.bytecode.dao.StudentDao;
import com.bytecode.entity.Student;

public class StudentService {

	private StudentDao dao;

	public StudentDao getDao() {
		return dao;
	}

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	public int insertStudentData(Student s) {
		return dao.insertStudent(s);
	}
}
