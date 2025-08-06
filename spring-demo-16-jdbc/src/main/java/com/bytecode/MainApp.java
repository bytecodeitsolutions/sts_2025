package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.entity.Student;
import com.bytecode.service.StudentService;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		StudentService service = applicationContext.getBean("studentService", StudentService.class);
		Student s1 = new Student();
		s1.setId(111);
		s1.setName("Raju");
		s1.setAge(20);
		s1.setAddress("kanpur");
		System.out.println(service.insertStudentData(s1) + " record inserted for :" + s1.getId());
	}
}
