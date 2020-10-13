package com.aop.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class AccountAspect {

	@AfterReturning(pointcut="execution(* com.aop.dao.AccountDAO.findAccounts(..))",returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
		
		String method = theJoinPoint.getSignature().toString();
		System.out.println("Executing @AfterReturning on method: " + method);
				
		System.out.println("result is: " + result);
		convertAccountNamesToLowerCase(result);

		System.out.println("new result is: " + result);
		
	}

	private void convertAccountNamesToLowerCase(List<Account> result) {
		for (Account tempAccount : result) {
			String theLowerName = tempAccount.getName().toLowerCase();
			tempAccount.setName(theLowerName);
		}

	}
	
	@Before("com.aop.aspect.AopExpressions.noGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {	
		
		System.out.println("Executing account aspect @Before advice ");	
		
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		
		System.out.println("Method Signature is : " + methodSignature);
		
		Object[] args = joinPoint.getArgs();
		
		for (Object arg : args) {
			System.out.println(arg);
			
			if (arg instanceof Account) {
				Account theAccount = (Account) arg;
				System.out.println("account name: " + theAccount.getName());
				System.out.println("account level: " + theAccount.getLevel());								

			}
		}
	}
	
	
}









