package com.spring.SpringDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringDemo.database.CustomerDatabase;
import com.spring.SpringDemo.entities.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDatabase customerDatabase;
	
	public Customer addCustomer(Customer customer) throws Exception
	{
		if(customer.getEmail()!= null  && !customer.getEmail().isBlank())
			return this.customerDatabase.insertCustomer(customer);
		throw new Exception("Email is mandatory");
	}
	
}
