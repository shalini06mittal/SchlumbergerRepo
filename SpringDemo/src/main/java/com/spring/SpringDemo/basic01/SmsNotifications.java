package com.spring.SpringDemo.basic01;

import org.springframework.stereotype.Component;

// spring to create object of this class
@Component
public class SmsNotifications implements Notifications{

	public SmsNotifications() {
		System.out.println("SMS Notifications");
	}
	@Override
	public void notifyUsers() {
		System.out.println("notify via SMS");
		
	}

}
