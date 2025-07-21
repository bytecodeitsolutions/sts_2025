package com.bytecode.dao;

import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
	public void store() {
		System.out.println("Student record inserted into DB");

	}
}
