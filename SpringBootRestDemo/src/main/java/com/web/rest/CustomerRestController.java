package com.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.entities.Customer;
import com.web.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {


	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List<Customer> getCustomer()
	{
		return this.customerService.getAllCustomers(null);
	}
	//http://localhost:8080/customers/shalini@gmail.com => path parameter
	//http://localhost:8080/customers?email=shalini@gmail.com
	@GetMapping("/{email}")
	public Customer getCustomer(@PathVariable String email)
	{
		return this.customerService.getCustomerByEmail(email);
	}
	@PostMapping
	public String addCustomer(@RequestBody Customer customer)
	{
		System.out.println("POST REQUEST");
		System.out.println(customer);
		String email;
		try {
			email = this.customerService.insertCustomer(customer);
			return email+" - Registration successful";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return e.getMessage();
		}
		
	}

	@PutMapping
	public List<Customer> updateCustomer()
	{
		return this.customerService.getAllCustomers(null);
	}
	@DeleteMapping
	public List<Customer> deleteCustomer()
	{
		return this.customerService.getAllCustomers(null);
	}
}
