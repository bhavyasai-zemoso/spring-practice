package com.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.java")
@PropertySource("classpath:names")
public class JavaConfig {
	
	@Bean
	public ICustomer customerOne() {
		return new CustomerOne();
	}
	
	@Bean
	public IDeveloper webDeveloper() {
		return new WebDeveloper(customerOne());
	}
		
}
