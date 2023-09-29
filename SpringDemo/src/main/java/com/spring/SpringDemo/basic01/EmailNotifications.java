package com.spring.SpringDemo.basic01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// spring to create object of this class
@Component
@Primary
public class EmailNotifications implements Notifications{

	public EmailNotifications() {
		System.out.println("Email Notifications");
	}
	@Override
	public void notifyUsers() {
		System.out.println("notify via Emails");
		
	}

}
