package com.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // sprning understands this class is processing HTTP request
public class HomeController {

	
	@GetMapping("/login")
	public String loginPage()
	{
		System.out.println("login page get called");
		return "login";
	}
}
