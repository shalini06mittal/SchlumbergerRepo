package com.demo;

public class MyService {

	private Notifications notification;// = new SmsNotifications();
	
	public MyService() {
		this.notification = new WhatsAppNotifications();
	}
	
	public MyService(Notifications notification) {
		this.notification = notification;
	}
	
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
