package com.web.mvc;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.entities.Customer;
import com.web.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/dashboard")
	public String showDashBoard(HttpSession session, Map<String, Customer> map) {
		
		String email = (String) session.getAttribute("email");
		if(email == null)
			return "redirect:login";
		else {
			Customer customer = this.service.getCustomerByEmail(email);
			map.put("customer", customer);
			return "dashboard";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.removeAttribute("email");
		session.invalidate();
		return "redirect:login";
	}
}
