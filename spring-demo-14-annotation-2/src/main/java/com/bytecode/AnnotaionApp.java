package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytecode.config.AppConfig;
import com.bytecode.controller.StudentController;

public class AnnotaionApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentController controller = applicationContext.getBean("sc", StudentController.class);
		controller.saveStudent();
	}

}
