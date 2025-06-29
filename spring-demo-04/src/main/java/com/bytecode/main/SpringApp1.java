package com.bytecode.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp1 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		/*
		 * BeanFactory beanFactory = new XmlBeanFactory(new
		 * ClassPathResource("applicationContex.xml")); Student
		 * obj=beanFactory.getBean("s1",Student.class); System.out.println("hello");
		 */

		
		/*
		 * Student obj = (Student) applicationContext.getBean("s1"); Teacher obj1 =
		 * applicationContext.getBean("t1", Teacher.class);
		 * 
		 * Student obj2 = (Student) applicationContext.getBean("s1"); Teacher obj3 =
		 * applicationContext.getBean("t1", Teacher.class);
		 * 
		 * System.out.println(obj.hashCode()); System.out.println(obj2.hashCode());
		 * 
		 * ((AbstractApplicationContext) applicationContext).close();
		 */
	}

}
