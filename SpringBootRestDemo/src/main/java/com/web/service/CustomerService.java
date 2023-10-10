package com.web.service;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entities.Customer;
import com.web.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public List<Customer> getAllCustomers(String city)
	{
		if(city == null || city.isBlank()) {
			return this.customerRepo.findAll();
		}
		return this.customerRepo.findByCity(city);
	}
	
	public String insertCustomer(Customer customer) throws Exception {
		String email = customer.getEmail();
		if(email == null)
		{
			throw new Exception("Please provide email id");
		}
		if(! customerRepo.existsById(email)) 
			return this.customerRepo.save(customer).getEmail();
		
		throw new EntityExistsException("Customer with "+email+" already exists");
	}
	public Customer updateCustomer(Customer customer) {
		String email = customer.getEmail();
		if( customerRepo.existsById(email)) 
			return this.customerRepo.save(customer);
		
		throw new EntityExistsException("Customer with "+email+" does not exists");
	}
	
	public Customer getCustomerByEmail(String email) {
		return this.customerRepo.findById(email)
				.orElseThrow(()-> 
				new EntityNotFoundException("Customer with "+email+" does not exists"));
	}
	
	public boolean deleteCustomerByEmail(String email) {
		if( customerRepo.existsById(email)) {
			 this.customerRepo.deleteById(email);
			 return true;
		}
		return false;
	}
	public boolean validateCustomer(String email, String password) throws Exception {
		if(this.customerRepo.existsById(email)) {
			Customer customer = customerRepo.findById(email).get();
			if(customer.getPassword().equals(password))
				return true;
			else {
				throw new Exception("Invalid credentials");
			}
		}
		throw new EntityNotFoundException("Email invalid");
	}
}
