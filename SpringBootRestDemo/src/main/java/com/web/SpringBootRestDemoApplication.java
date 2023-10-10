package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.web.entities.Customer;
import com.web.repo.CustomerRepo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

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
		Customer c3 = new Customer("c@c.com", "C", "C", "Mumbai", "India", "1212121212", "cc");
		Customer c4 = new Customer("d@d.com", "D", "D", "Delhi", "India", "2323232323", "dd");
		customerRepo.save(c1);
		customerRepo.save(c2);
		customerRepo.save(c3);
		customerRepo.save(c4);
	}
	
	@Bean
	OpenAPI custom()
	{
		return new OpenAPI()
				.info(new Info()
						.title("Customer Management System")
						.contact(new Contact()
								.email("dummy@dummy.com")
								.name("SLB")
								.url("http://www.google.com")
								)
						.description("Documnetation for CMS for anyone to consume hte services")
						.license(new License().name("DUMMY"))
						.termsOfService("Terms")
						);
	}

}
