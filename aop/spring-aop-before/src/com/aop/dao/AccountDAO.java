package com.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.aop.aspect.Account;

@Component
public class AccountDAO {

	private String name;
	
	public void addAccount(Account theAccount) {
		
		System.out.println("addAccount() in account dao component");
		
	}
	public String getName() {
		System.out.println("in getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("in setName()");
		this.name = name;
	}

	
}




