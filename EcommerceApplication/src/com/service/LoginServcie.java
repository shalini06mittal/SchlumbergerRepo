package com.service;

import com.datasource.CustomerDatabase;

public class LoginServcie {

	private CustomerDatabase customerDatabase;
	
	public LoginServcie(CustomerDatabase customerDatabase) {
		// TODO Auto-generated constructor stub
		this.customerDatabase = customerDatabase;
	}
	
	public boolean validateCustomer(String email, String password)
	{
		// call findCutomerbyEmail of customer database
		// validate the customer for credentials
		return true;
	}
}
