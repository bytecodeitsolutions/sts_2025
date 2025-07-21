package com.bytecode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bytecode.dao.StudentRepository;

@Component
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public void insert() {
		System.out.println("Student record processed from service");
		repository.store();

	}
}
