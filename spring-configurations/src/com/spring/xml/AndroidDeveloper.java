package com.spring.xml;

public class AndroidDeveloper implements IDeveloper{
	private String developerName;
	private ICustomer customer;
	
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public AndroidDeveloper(ICustomer customer) {
		this.customer=customer;
	}
	
	public String displayCustomer() {
		return "Android Developer "+customer.displayCustomer();
		
	}

	
	public String displaySkills() {
		return "Android Developer skills are PHP,SQL,XML,Android Studio";
		
	}
	
	
	
}
