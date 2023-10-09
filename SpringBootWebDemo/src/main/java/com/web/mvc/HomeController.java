package com.web.mvc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.entities.Customer;
import com.web.service.CustomerService;


@Controller // spring understands this class is processing HTTP request
public class HomeController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/login")
	public String loginPage(Map<String, List<String>> map,
			Map<String, String> mapError,
			@RequestParam(required = false) String error)
	{
		if(error != null)
			mapError.put("error", error);
		System.out.println("login page get called");
		List<String> roles = Arrays.asList(
				"ADMIN", "MANAGER", "DEVELOPER");
		map.put("roles", roles);
		return "login";
	}
	@GetMapping("/register")
	public String registrationPage()
	{
		System.out.println("register page get called");
		return "register";
	}
	// GET http://..../login?name=
	// POST http://..../login
	//	@PostMapping("/login")
	//	public String loginCustomer(@RequestParam("email1") String email, 
	//			@RequestParam String password,
	//			@RequestParam String role,
	//			@RequestParam Integer age)
	//	{
	//		System.out.println(email);
	//		System.out.println(password);
	//		System.out.println(role);
	//		System.out.println(age+20);
	//		return "dashboard";
	//	}
	@PostMapping("/login")
	public String loginCustomer(@RequestParam String email, 
			@RequestParam String password,
			@RequestParam String role, HttpSession session)
	{
		System.out.println(email);
		System.out.println(password);
		System.out.println(role);
		try {
			this.customerService.validateCustomer(email, password);
			session.setAttribute("email", email);
			return "redirect:dashboard";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:login?error="+e.getMessage();
		}
		
	}
	@PostMapping("/register")
	public String registerCustomer(Customer customer)
	{
		System.out.println(customer);
		try {
			String email = this.customerService.insertCustomer(customer);
			return "redirect:login";
		}catch(Exception e) {
			return "redirect:register";
		}

		
	}
}
