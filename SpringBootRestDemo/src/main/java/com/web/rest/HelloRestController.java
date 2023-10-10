package com.web.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller + @ResponseBody
@RestController
@RequestMapping("/api")
public class HelloRestController {	
	// general annotation
//	@RequestMapping("/all")
//	public String AllData(HttpServletRequest request){
//		System.out.println(request.getMethod());
//		return "ALL";
//	}
	@GetMapping
	public String getData(){
		// fetch
		return "GET!!";
	}
	@PostMapping
	public String postData(){
		// insert
		return "POST";
	}
	@PutMapping
	public String putData(){
		/// update
		return "PUT";
	}
	@DeleteMapping
	public String deleteData(){
		//delete
		return "DELETE";
	}
	
}
