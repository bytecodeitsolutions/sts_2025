package com.bytecode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bytecode.service.StudentService;

@Component("sc")
public class StudentController {
	
	@Autowired
	private StudentService service;

	public void saveStudent() {
		System.out.println("record processed from controoller to service");
	   service.insert();
	}
}
