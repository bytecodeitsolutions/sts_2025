package com.bytecode.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PrimaryAutowireApp {

	public static void main(String[] args) {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	   ApplicationContext  context=new AnnotationConfigApplicationContext(AppConfig.class);
		Bike obj=context.getBean("bike1",Bike.class);
	    obj.ride();
	}
}
