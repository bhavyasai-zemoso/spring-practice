package com.aop.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class MethodService {

	public String getService() {

		try {
			
			TimeUnit.SECONDS.sleep(5);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return "delayed the service method for 5 seconds";
		
	}

	public String getService(boolean flag) {
		if(flag) {
			throw new RuntimeException("exception when flag is true");
		}
		return getService();
	}
}