package com.web.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entities.Customer;

//public interface CustomerRepo extends CrudRepository<Customer, String>{
//
//}
// JPA is an extension of Crud => basic queries + pagination and sorting and querying by other fields
public interface CustomerRepo extends JpaRepository<Customer, String>{
	public List<Customer> findByCity(String city);
	
}
