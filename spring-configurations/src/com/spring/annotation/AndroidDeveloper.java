package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AndroidDeveloper implements IDeveloper{
	
	private ICustomer customer;
	
	

	public AndroidDeveloper() {
		System.out.println("Inside Android Developer constructor");
	}

	@Autowired
	@Qualifier("customerOne")
	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}

	@Override
	public String displayCustomer() {
		return "Android Developer "+customer.displayCustomer();
		
	}

	@Override
	public String displaySkills() {
		return "Android Developer skills are PHP,SQL,XML,Android Studio";
		
	}
	
	
	
}
