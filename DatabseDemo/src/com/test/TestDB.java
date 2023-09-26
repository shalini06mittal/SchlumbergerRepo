package com.test;

import com.db.CustomerDatabase;
import com.db.DBConnection;
import com.entities.Customer;

public class TestDB {

	public static void main(String[] args) {
		//DBConnection.connect();
		
		CustomerDatabase db = new CustomerDatabase();
		Customer customer = new Customer("harsha@gmail.com", "Harsha", "Goyal", "Pune", "India","harsha", "2323232323");
		System.out.println(db.insertCustomer(customer));
		

	}

}
