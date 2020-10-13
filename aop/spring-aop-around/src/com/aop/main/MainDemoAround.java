package com.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.config.AopConfig;
import com.aop.service.MethodService;

public class MainDemoAround {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AopConfig.class);
		
		MethodService methodService = context.getBean("methodService", MethodService.class);
		
		System.out.println("Calling getService() with argument");
		
		//String data = methodService.getService();
		
		//System.out.println("service is: " + data);
		
		String data1 = methodService.getService(true);
		
		System.out.println("service is: " + data1);
		
		System.out.println("Finished");
		
		context.close();
	}

}









