package com.web.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.web.entities.Customer;
import com.web.service.CustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/customers")
@Tag(name = "Customer", description = "Manage customers")
public class CustomerRestController {


	@Autowired
	private CustomerService customerService;

	/**
	 * Content negotiation => JSON, XML
	 * REST => Representational State Transfer
	 * @param city
	 * @return
	 */
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Customer> getCustomers(
			@RequestParam(required = false, defaultValue = "Mumbai") String city)
	{
		return this.customerService.getAllCustomers(city);
		
	}
	//http://localhost:8080/customers/shalini@gmail.com => path parameter
	//http://localhost:8080/customers?email=shalini@gmail.com
//	@GetMapping("/{email}")
//	public Customer getCustomer(@PathVariable String email)
//	{
//		return this.customerService.getCustomerByEmail(email);
//	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	//@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> handleException(EntityNotFoundException ex){
		System.out.println("Handle Exception enity not found");
		Map<String, Object> map = new HashMap<>();
		map.put("message", ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}
	
	@ExceptionHandler(EntityExistsException.class)
	public ResponseEntity<Object> handleException(EntityExistsException ex){
		System.out.println("Handle Exception entity exists");
		Map<String, Object> map = new HashMap<>();
		map.put("message", ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(map);
	}
	
	@GetMapping(value="/{email}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Object> getCustomer(@PathVariable String email)
	{
			Customer customer = this.customerService.getCustomerByEmail(email);
			return ResponseEntity.ok(customer);
	}
	
	// headers, status, body , methods
//	@GetMapping(value="/{email}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//	public ResponseEntity<Object> getCustomer(@PathVariable String email)
//	{
//		Map<String, Object> map = new HashMap<>();
//		try {
//			
//			Customer customer = this.customerService.getCustomerByEmail(email);
//			map.put("customer", customer);
//			return ResponseEntity.ok(map);
//		}
//		catch(Exception e) {
//			//return ResponseEntity.noContent().build();
//			map.put("message", e.getMessage());
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
//		}
//	}
	@PutMapping
	public ResponseEntity<Object> updateCustomer(@RequestBody Customer customer)
	{
		//Map<String, Object> map = new HashMap<>();
		//try {
			Customer cust = this.customerService.updateCustomer(customer);
		//	map.put("customer", cust);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(cust);
//		}
//		catch(Exception e) {
//			map.put("message", e.getMessage());
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
//		}
	}
	@DeleteMapping("/{email}")
	public ResponseEntity<Object> deleteCustomer(@PathVariable String email)
	{
		Map<String, Object> map = new HashMap<>();
		if(this.customerService.deleteCustomerByEmail(email)) {
			map.put("message", email+" deleted successfully");
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(map);
		}
		else {
			map.put("message", email+" deletion unsuccessfull");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
		}
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

	
}
