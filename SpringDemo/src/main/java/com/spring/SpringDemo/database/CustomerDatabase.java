package com.spring.SpringDemo.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDatabase {

	@Autowired
	private JdbcTemplate template;
	
	public Long getCustomerCount()
	{
		String sql = "select count(*) from customer";
		return this.template.queryForObject(sql, Long.class);
	}
	
}
