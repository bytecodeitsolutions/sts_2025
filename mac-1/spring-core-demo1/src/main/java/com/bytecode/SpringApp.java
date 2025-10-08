package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
    Car  car= applicationContext.getBean("carBean",Car.class);
    car.drive();
	}

}
