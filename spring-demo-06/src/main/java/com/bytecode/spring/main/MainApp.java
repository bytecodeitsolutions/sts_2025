package com.bytecode.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.Cat;
import com.bytecode.spring.Dog;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Dog dog = applicationContext.getBean("dog", Dog.class);
		Cat cat = applicationContext.getBean("cat", Cat.class);
		System.out.println(cat);
		System.out.println(dog);
	}

}
