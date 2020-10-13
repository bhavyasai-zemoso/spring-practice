package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudAspect {

	@Before("com.aop.aspect.before.AopExpressions.noGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("Executing cloud aspect @Before advice ");		
	}

}
