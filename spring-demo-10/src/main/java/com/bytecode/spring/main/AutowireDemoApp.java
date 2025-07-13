package com.bytecode.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.A;

public class AutowireDemoApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	     A obj = applicationContext.getBean("a", A.class);
		obj.check();

	}

}
