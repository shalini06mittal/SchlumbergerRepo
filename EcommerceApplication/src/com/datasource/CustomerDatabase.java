package com.datasource;

import java.util.ArrayList;
import java.util.List;

import com.entities.Customer;

public class CustomerDatabase {

	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerDatabase() {
		// add 2 customers data
	}
	public boolean addCustomer(Customer customer) {
		return true;
	}
	public List<Customer> getAllCustomers()
	{
		return customers;
	}
	public Customer findCustomerByEmail(String email)
	{
		// find cutomer by email and return the customer object found
		return null;
	}
}
