package com.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public void addAccount() {
		
		System.out.println("addacccount() in membershipDAO component");
		
	}
}
