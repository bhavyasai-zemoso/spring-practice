package com.spring.java;

import org.springframework.beans.factory.annotation.Value;

public class WebDeveloper implements IDeveloper {
	
	@Value("${name}")
	private String developerName;
	private ICustomer customer;
	
	public WebDeveloper(ICustomer customer) {
		this.customer = customer;
	}

	@Override
	public String displayCustomer() {
		return "Web "+customer.displayCustomer();
	}

	@Override
	public String displaySkills() {
		return "Web Developer "+developerName+" skills are React,Spring,JS";
	}

}
