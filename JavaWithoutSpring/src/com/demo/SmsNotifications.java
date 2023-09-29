package com.demo;

public class SmsNotifications implements Notifications{

	@Override
	public void notifyUsers() {
		System.out.println("notify via SMS");
		
	}

}
