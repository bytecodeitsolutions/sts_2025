package com.bytecode.manapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.Radio;

public class MainSpringApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");// sasu maa -->pass
																									// wife
		Radio radio = context.getBean("radio", Radio.class);
		radio.playSong();
	}

}
