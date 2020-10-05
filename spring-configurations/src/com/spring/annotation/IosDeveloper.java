package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IosDeveloper implements IDeveloper {
	
	
	@Autowired
	@Qualifier("customerTwo")
	private ICustomer customer;

	@Override
	public String displayCustomer() {
		return "Ios "+customer.displayCustomer();
	}

	@Override
	public String displaySkills() {
		return "Tech used by Ios Developer is Swift";
	}

}
