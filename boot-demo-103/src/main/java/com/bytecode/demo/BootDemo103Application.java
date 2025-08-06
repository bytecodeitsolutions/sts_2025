package com.bytecode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootDemo103Application {

	public static void main(String[] args) {
		ApplicationContext obj=SpringApplication.run(BootDemo103Application.class, args);
	    Test t1=obj.getBean("getTest",Test.class);
	    t1.m1();
	}

	@Bean
	Test getTest() {
		return new Test();
	}

}
