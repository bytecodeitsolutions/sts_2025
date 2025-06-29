package com.bytecode.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.A;
import com.bytecode.spring.beans.B;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	   A  obj=context.getBean("z",A.class);
	   A  obj1=context.getBean("y",A.class);
	   System.out.println(obj.hashCode());
	   System.out.println(obj1.hashCode());
	}

}
