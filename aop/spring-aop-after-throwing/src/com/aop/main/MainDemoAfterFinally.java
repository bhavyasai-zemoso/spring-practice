package com.aop.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.aspect.Account;
import com.aop.config.AopConfig;
import com.aop.dao.AccountDAO;


public class MainDemoAfterFinally {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AopConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> accounts = null;
		try {
			boolean flag=true;
			accounts=accountDAO.findAccounts(flag);
		}
		catch(Exception e) {
			System.out.println("caught exception "+e);
		}
		System.out.println("in main block "+accounts);
		context.close();
	}

}










