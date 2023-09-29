package com.demo;

import java.util.Scanner;

public class Test {
/**
 * 1. Create objects of Service
 * 2. Create objects of notifications type
 * 3. Inject dependency to service class using constructor or setter
 * SPRING -> DI, AOP, HAL
 * @param args
 */
	public static void main(String[] args) {
		System.out.println("Choose mode of notification");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		//Notifications notifications = null;
		//MyService service = new MyService();
		switch(choice) {
		case 1:
			// sms
		//	notifications = new SmsNotifications();
		//	service.setNotification(notifications);
			//MyService service1 = new MyService(notifications);
			MyService service ;// give me the reference
			service.generateBill(); // 
			break;
		case 2:
			// email
			notifications = new EmailNotifications();
			service.setNotification(notifications);
			//MyService service2 = new MyService(notifications);
			service.generateBill(); // 
			break;
			default:
				service.generateBill(); // 
				System.out.println("default notification mode");
		}

	}

}
