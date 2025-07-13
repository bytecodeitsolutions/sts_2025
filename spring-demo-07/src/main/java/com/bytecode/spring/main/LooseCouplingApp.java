package com.bytecode.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bytecode.spring.beans.AlertMessage;
import com.bytecode.spring.service.MessageService;

public class LooseCouplingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		AlertMessage alertMessage = applicationContext.getBean("ams", AlertMessage.class);
		alertMessage.sendAlertMessage("aandhi pani ane wali hai");
	}

}
