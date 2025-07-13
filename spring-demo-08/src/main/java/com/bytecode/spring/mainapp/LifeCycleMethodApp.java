package com.bytecode.spring.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.DbConnection;

public class LifeCycleMethodApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		DbConnection connection = applicationContext.getBean("db", DbConnection.class);
		System.out.println("We are using connection object");
		System.out.println(connection.toString());
		((AbstractApplicationContext) applicationContext).close();
	}

}
