package com.bytecode.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.Customer;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = applicationContext.getBean("customer", Customer.class);
		customer.displayAllData();
	}
}
