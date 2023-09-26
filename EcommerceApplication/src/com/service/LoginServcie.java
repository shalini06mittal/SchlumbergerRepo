package com.service;

import com.datasource.CustomerDatabase;

public class LoginServcie {

	// has-a
	private CustomerDatabase customerDatabase;
	
	public LoginServcie(CustomerDatabase customerDatabase) {
		// TODO Auto-generated constructor stub
		this.customerDatabase = customerDatabase;
	}
	// true => success, false => failure
	/**
	 * failure => N/W conn
	 * usernmae 
	 * password
	 * @throws Exception 
	 */
	public boolean validateCustomer(String email, String password) throws Exception
	{
		// call findCutomerbyEmail of customer database
		// validate the customer for credentials
		String pwd = customerDatabase.findCustomerByEmail(email);
		if(pwd == null) {
			throw new Exception("User with email does not exist");
		}
		if(pwd.equals(password))
			return true;
		throw new Exception("Invalid Credentials");
	}
}
