package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.web.entities.Customer;

//public interface CustomerRepo extends CrudRepository<Customer, String>{
//
//}
// JPA is an extension of Crud => basic queries + pagination and sorting and querying by other fields
public interface CustomerRepo extends JpaRepository<Customer, String>{

}
