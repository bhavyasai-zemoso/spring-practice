package com.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.aspect.Account;
import com.aop.config.AopConfig;
import com.aop.dao.AccountDAO;
import com.aop.dao.MembershipDAO;

public class MainDemoBefore {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AopConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		Account account = new Account();
		accountDAO.addAccount(account);
		accountDAO.setName("Harry");
		accountDAO.getName();
		membershipDAO.addAccount();
		context.close();
	}

}










