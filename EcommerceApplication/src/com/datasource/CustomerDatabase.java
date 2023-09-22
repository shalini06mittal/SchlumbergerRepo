package com.datasource;

import java.util.ArrayList;
import java.util.List;

import com.entities.Customer;

public class CustomerDatabase {

	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerDatabase() {
		customers.add(new Customer("a@a.com", "A", "A", "Mumbai", "India", "1212121212", "aa"));
		customers.add(new Customer("b@b.com", "B", "B", "Pune", "India", "2323232323", "bb"));
	}
	public boolean addCustomer(Customer customer) {
		customers.add(customer);
		return true;
	}
	public List<Customer> getAllCustomers()
	{
		return customers;
	}
	public String findCustomerByEmail(String email)
	{
		// find cutomer by email and return the customer object found
		for(Customer c : customers)
		{
			if(c.getEmail().equals(email))
				return c.getPassword();
		}
		return null;
	}
}
