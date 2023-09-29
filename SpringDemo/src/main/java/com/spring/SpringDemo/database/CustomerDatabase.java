package com.spring.SpringDemo.database;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.SpringDemo.entities.Customer;

@Repository
public class CustomerDatabase {

	@Autowired
	private JdbcTemplate template;
	
	public Long getCustomerCount()
	{
		String sql = "select count(*) from customer";
		return this.template.queryForObject(sql, Long.class);
	}
	
	public Customer insertCustomer(Customer customer) throws Exception
	{
		String sql = "insert into customer values(?,?,?,?,?,?,?)";
		try {
		this.template.update(sql, customer.getEmail(), customer.getFristname(), 
				customer.getLastname(), customer.getCity(), customer.getCountry(), customer.getPassword(), customer.getPhone()
				);
		}
		catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return customer;
	}
	
	
	
}
