package com.spring.SpringDemo.basic01;

import org.springframework.stereotype.Component;

// spring to create object of this class
@Component("whatsapp")
public class WhatsAppNotifications implements Notifications{

	public WhatsAppNotifications() {
		System.out.println("WhatsApp Notifications");
	}
	@Override
	public void notifyUsers() {
		System.out.println("notify via WhatsApp");
		
	}
}
