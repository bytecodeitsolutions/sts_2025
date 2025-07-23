package com.bytecode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytecode.config.AppConfig;
import com.bytecode.entity.Radio;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
       Radio radio= applicationContext.getBean("radio",Radio.class);
	   radio.playMusic();
	}

}
