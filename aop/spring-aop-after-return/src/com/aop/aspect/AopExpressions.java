package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

	@Pointcut("execution(* com.aop.dao.*.*(..))")
	public void firstPointcut() {}
	
	@Pointcut("execution(* com.aop.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.aop.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("firstPointcut() && !(getter() || setter())")
	public void noGetterSetter() {}

}
