package com.aop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aop.config.AopConfig;
import com.aop.dao.AccountDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class TestAspect {
	

	@Autowired
	private TestClass ts;
	
	@Autowired
	private AccountDAO accountDAO;

	@Test
	public void testSomething() {
		ts.sayHi("in28Minutes");
		ts.sayBye();
		ts.returnSomething();
	
	}

}