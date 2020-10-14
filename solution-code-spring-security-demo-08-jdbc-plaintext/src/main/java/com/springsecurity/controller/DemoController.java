package com.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	

	@GetMapping("/managers")
	public String showManagers() {
		
		return "managers";
	}
	
	
	@GetMapping("/developers")
	public String showEmployees() {
		
		return "developers";
	}
	
}










