package com.bytecode.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.Test1;
import com.bytecode.spring.beans.Test4;

public class PrimaryAutowireApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Test4 test1 = (Test4) applicationContext.getBean("test4");
		System.out.println(test1);
		
	}

}
