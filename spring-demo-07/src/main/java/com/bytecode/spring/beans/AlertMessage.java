package com.bytecode.spring.beans;

import com.bytecode.spring.service.MessageService;

public class AlertMessage {
	private MessageService messageService;

	public AlertMessage(MessageService messageService) {
		this.messageService = messageService;
	}

	public void sendAlertMessage(String msg) {
		messageService.sendNotifications(msg);
	}

}
