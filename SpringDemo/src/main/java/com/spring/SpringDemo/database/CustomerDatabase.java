package com.spring.SpringDemo.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
					customer.getLastname(), customer.getCity(), customer.getCountry(), 
					customer.getPassword(), customer.getPhone()
					);
		}
		catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		return customer;
	}

	public Customer getCustomerByEmail(String email) throws Exception {
		String sql = "select * from customer where email=?";
		/**
		 * 
		 */
		try {
		return this.template.queryForObject(sql, new CustomerRowMapper(), email);
		}catch(DataAccessException e) {
			throw new Exception("Email does not exist");
		}
	}
	
	public List<Customer> getCustomers()  {
		String sql = "select * from customer";

		return this.template.query(sql, new CustomerRowMapper());
	}


	class CustomerRowMapper implements RowMapper<Customer>{

		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setEmail(rs.getString(1));
			customer.setFristname(rs.getString(2));
			customer.setLastname(rs.getString(3));
			customer.setCity(rs.getString(4));
			customer.setCountry(rs.getString(5));
			customer.setPassword(rs.getString(6));
			customer.setPhone(rs.getString(7));
			return customer;
		}

	}


}
