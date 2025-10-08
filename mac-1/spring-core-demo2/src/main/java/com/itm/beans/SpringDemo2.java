package com.itm.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Radio radio = applicationContext.getBean("radio", Radio.class);
		Radio radio1 = (Radio) applicationContext.getBean("radio");
		System.out.println(radio.hashCode());
		System.out.println(radio1.hashCode());
		//radio.playSong();
	}

}
