package com.client;

import java.util.Scanner;

import com.datasource.CustomerDatabase;
import com.entities.Customer;
import com.service.LoginServcie;

public class CustomerEntry {
	static Scanner sc = new Scanner(System.in);
	static CustomerDatabase database = new CustomerDatabase();
	static LoginServcie loginServcie = new  LoginServcie(database);

	public static void main(String[] args) {
		/**
		 * display a menu as follows:
		 * 1. ask new or existing customer
		 * 2. if new ask to sign in ,all info about customer and store in the list
		 * 3. if existing ask the user to login => validateCsutomer() of LoginService
		 * 4. To view all customers
		 */
		

		String email, password;
		System.out.println("0.Exit\n1. Login\n2. Register\n3.View All");
		int choice = sc.nextInt();
		boolean exit = false;
		while(!exit) {
			switch(choice) {
			case 0:
				System.out.println("Thanks for visiting!!");
				exit = true;
				break;
			case 1:
				loginUser();
				break;
			case 2:
				System.out.println("Enter email");
				email = sc.next();
				System.out.println("Enter password");
				password = sc.next();
				System.out.println("Enter firstname");
				String firstname = sc.next();
				System.out.println("Enter lastname");
				String lastname = sc.next();
				System.out.println("Enter city");
				String city = sc.next();
				System.out.println("Enter country");
				String country = sc.next();
				System.out.println("Enter phone");
				String phone = sc.next();
				Customer customer = new Customer(email, firstname, lastname, city, country, phone, password);
				if(database.addCustomer(customer)) {
					System.out.println("Registered successfully, Please login");
					loginUser();
				}

			}
		}

	}
	public static void loginUser()
	{
		System.out.println("Enter email");
		String email = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		if(loginServcie.validateCustomer(email, password)) {
			System.out.println("Login successful");
			showDashboard(email);
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
	public static void showDashboard(String email){

		System.out.println("0.Logout\n1. View Profile\n2.Edit Profile\n3.");
	}


}
