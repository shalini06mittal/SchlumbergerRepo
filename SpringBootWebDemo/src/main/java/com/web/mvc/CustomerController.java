package com.web.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	@GetMapping("/dashboard")
	public String showDashBoard() {
		return "dashboard";
	}
}
