package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// Loads log4j.properties automatically
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageService msgService = (MessageService) context.getBean("msgService");
		msgService.sendMessage("Hello from Spring with Log4j!");
	}
}
