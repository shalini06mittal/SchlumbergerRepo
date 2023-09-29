package com.spring.SpringDemo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DBConfig {

	@Value("com.mysql.cj.jdbc.Driver")
	private String driver;
	@Value("jdbc:mysql://localhost:8889/ecomm?useSSL=false")
	private String url;
	@Value("root")
	private String username;
	@Value("root")
	private String password;
	
	/**
	 * Template design pattern
	 * DriverManagerDataSource => RDBMS
	 * @return
	 * to provide connection parameters for the database 
	 */
	@Bean
	public DataSource dataSource()
	{	
		System.out.println("connecting to database");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
		
	}
	@Bean
	public JdbcTemplate template()
	{
		return new JdbcTemplate(dataSource());
	}
}
