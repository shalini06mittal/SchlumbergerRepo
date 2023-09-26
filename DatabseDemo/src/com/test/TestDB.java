package com.test;

import java.util.List;

import com.db.CustomerDatabase;
import com.db.DBConnection;
import com.entities.Customer;

public class TestDB {

	public static void main(String[] args) {
		//DBConnection.connect();
		
		CustomerDatabase db = new CustomerDatabase();
		Customer customer = new Customer("harsha@gmail.com", "Harsha", "Goyal", "Pune", "India","harsha", "2323232323");
		//System.out.println(db.insertCustomer(customer));
		try {
			List<Customer> list = db.getCustomers();
			list.forEach(cust -> System.out.println(cust));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		try {
			System.out.println(db.getCustomerByEmail("shalini@gmail.com"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
