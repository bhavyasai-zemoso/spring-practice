package com.spring.hibernate.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WizardLoggingAspect {
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.spring.hibernate.controller.*.*(..))")
	private void forControllerPackage() {}

	@Pointcut("execution(* com.spring.hibernate.service.*.*(..))")
	private void forServicePackage() {}
	
	@Pointcut("execution(* com.spring.hibernate.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {}
	
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint) {
		
		String method = joinPoint.getSignature().toShortString();
		logger.info("\n@Before: calling method: " + method);
		
		Object[] args = joinPoint.getArgs();
		
		for (Object tempArg : args) {
			logger.info("\nargument: " + tempArg);
		}
			
	}
	
	@AfterReturning(pointcut="forAppFlow()",returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
	
		String theMethod = joinPoint.getSignature().toShortString();
		logger.info("\n in @AfterReturning: from method: " + theMethod);
		logger.info("result: " + result);
	
}
}
