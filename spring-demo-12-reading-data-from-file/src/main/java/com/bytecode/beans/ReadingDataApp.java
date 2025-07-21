package com.bytecode.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadingDataApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		AppDetails appDetails = applicationContext.getBean("ad", AppDetails.class);
		System.out.println(appDetails.getAppName());
		System.out.println(appDetails.getAppVersion());
	}

}
