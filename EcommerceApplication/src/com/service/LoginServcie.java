package com.service;

import com.datasource.CustomerDatabase;

public class LoginServcie {

	// has-a
	private CustomerDatabase customerDatabase;
	
	public LoginServcie(CustomerDatabase customerDatabase) {
		// TODO Auto-generated constructor stub
		this.customerDatabase = customerDatabase;
	}
	
	public boolean validateCustomer(String email, String password)
	{
		// call findCutomerbyEmail of customer database
		// validate the customer for credentials
		String pwd = customerDatabase.findCustomerByEmail(email);
		if(pwd != null && pwd.equals(password))
			return true;
		return false;
	}
}