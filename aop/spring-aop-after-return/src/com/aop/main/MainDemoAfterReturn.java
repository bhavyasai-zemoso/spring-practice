package com.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.aop.config.AopConfig;
import com.aop.dao.AccountDAO;


public class MainDemoAfterReturn {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AopConfig.class);
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		System.out.println(accountDAO.findAccounts());
		context.close();
	}

}










