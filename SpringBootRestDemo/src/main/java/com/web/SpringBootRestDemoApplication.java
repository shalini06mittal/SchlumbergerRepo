package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.web.entities.Customer;
import com.web.repo.CustomerRepo;

@SpringBootApplication
public class SpringBootRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestDemoApplication.class, args);
	}
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Bean
	public void data()
	{
		Customer c1 = new Customer("a@a.com", "A", "A", "Mumbai", "India", "1212121212", "aa");
		Customer c2 = new Customer("b@b.com", "B", "B", "Pune", "India", "2323232323", "bb");
		customerRepo.save(c1);
		customerRepo.save(c2);
	}

}
