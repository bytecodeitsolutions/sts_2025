package com.bytecode.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.beans.Customer;

public class DIApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Customer customer = applicationContext.getBean("c1", Customer.class);
		customer.checkBalance();
		System.out.println(customer.getAddress());
		System.out.println(customer.getPhoneNumbers());
	}

}
