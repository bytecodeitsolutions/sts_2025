package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytecode.bean.Car;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Car c1 = applicationContext.getBean("car", Car.class);
		c1.move();
	}

}
