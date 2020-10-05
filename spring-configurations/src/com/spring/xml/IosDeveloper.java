package com.spring.xml;

public class IosDeveloper implements IDeveloper {
	private String developerName;
	private ICustomer customer;
	
	public IosDeveloper() {
		System.out.println("Inside Ios Developer constructor");
	}
	
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}



	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}

	@Override
	public String displayCustomer() {
		return "Ios "+customer.displayCustomer();
	}

	@Override
	public String displaySkills() {
		return "Tech used by Ios Developer "+developerName+"  is Swift";
	}

}
