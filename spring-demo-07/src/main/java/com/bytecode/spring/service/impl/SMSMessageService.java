package com.bytecode.spring.service.impl;

import com.bytecode.spring.service.MessageService;

public class SMSMessageService implements MessageService{

	@Override
	public void sendNotifications(String msg) {
		System.out.println("Notification via SMS " + msg);
		
	}

}
