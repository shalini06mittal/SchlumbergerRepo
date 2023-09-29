package com.spring.SpringDemo.basic01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	@Autowired
	// autowired injects the object of type Notifications within
	// MyService class
	private Notifications notification;// = new SmsNotifications();

	public MyService() {
		//this.notification = new WhatsAppNotifications();
		System.out.println("My Serrice constructor");
	}
	//@Autowired
	// constructor injection
	public MyService( Notifications notification) {
		System.out.println("My service param const");
		this.notification = notification;
	}
	
	//@Autowired
	public void setNotification(Notifications notification) {
		this.notification = notification;
	}

	public void generateBill()
	{
		// payment service
		System.out.println("generating bill");
		// notify the user with the mode they have chosen
		notification.notifyUsers();
	}
	public void shipment()
	{
		// notifications
	}
	public void m1()
	{
		// notifications
	}
}
