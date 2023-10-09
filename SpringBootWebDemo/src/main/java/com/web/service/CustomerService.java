package com.web.service;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entities.Customer;
import com.web.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public String insertCustomer(Customer customer) {
		
		String email = customer.getEmail();
		if(! customerRepo.existsById(email)) 
			return this.customerRepo.save(customer).getEmail();
		
		throw new EntityExistsException("Customer with "+email+" already exists");
	}
}
