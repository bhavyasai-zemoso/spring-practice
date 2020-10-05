package com.spring.xml;

public class WebDeveloper implements IDeveloper{
	
	
	private ICustomer customer;
	
	public WebDeveloper(ICustomer customer) {
		this.customer=customer;
	}
	public String displaySkills() {
		return "Web Developer skills are HTML,CSS,Javascript";
	}

	@Override
	public String displayCustomer() {
		return "Web Developer "+customer.displayCustomer();
	}

	public void startBean() {
		System.out.println("WebDeveloper : custom bean init method");
	}
	
	public void destroyBean() {
		System.out.println("WebDeveloper : custom bean destroy method");
	}
	
}