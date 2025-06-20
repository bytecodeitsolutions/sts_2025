package com.bytecode.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bytecode.spring.beans.Car;

public class App {

	public static void main(String[] args) {

		System.out.println("=== Using ApplicationContext ===");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("ApplicationContext loaded");

		System.out.println("Getting car bean from ApplicationContext...");
		Car car1 = (Car) context.getBean("car");
		car1.move();

		/*
		 * System.out.println("\n=== Using BeanFactory ==="); BeanFactory factory = new
		 * XmlBeanFactory(new ClassPathResource("beans.xml"));
		 * System.out.println("BeanFactory loaded");
		 * 
		 * System.out.println("Getting car bean from BeanFactory..."); Car car2 = (Car)
		 * factory.getBean("car"); car2.move();
		 */

	}

}
