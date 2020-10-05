package com.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component("myWebDeveloper")
@Scope("prototype")
public class WebDeveloper implements IDeveloper{
	
	@Value("${name}")
	public String developerName;
	private ICustomer customer;
	
	@PostConstruct
	public void startBean() {
		System.out.println("WebDeveloper : custom bean init method");
	}
	
	@PreDestroy
	public void destroyBean() {
		System.out.println("WebDeveloper : custom bean destroy method");
	}
	
	@Autowired
	public WebDeveloper(@Qualifier("customerOne")ICustomer customer) {
		this.customer=customer;
	}
	public String displaySkills() {
		return "Web Developer "+developerName+" skills are HTML,CSS,Javascript";
	}

	@Override
	public String displayCustomer() {
		
		return customer.displayCustomer();
	}

	
	
}