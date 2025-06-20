package com.bytecode.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object c1 = context.getBean("car");
		Car obj = (Car) c1;
		obj.move();
	}

}
