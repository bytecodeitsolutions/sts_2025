package com.bytecode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = context.getBean("customer", Customer.class);
		customer.checkBalance();
		
		Customer customer1 = context.getBean("customer", Customer.class);
		customer1.checkBalance();
	}
	

}
