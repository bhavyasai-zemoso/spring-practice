package com.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class CustomerOne implements ICustomer{

	@Override
	public String displayCustomer() {
		return "Developer is working for customer 1 MS";
	}

}
