package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AnalyticsAspect {

	@Before("com.aop.aspect.AopExpressions.noGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("Executing analytics aspect @Before advice ");		
	}

}
