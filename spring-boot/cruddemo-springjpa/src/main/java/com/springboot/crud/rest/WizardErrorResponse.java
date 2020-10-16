package com.springboot.crud.rest;

public class WizardErrorResponse {

	private int status;
	private String message;
	
	public WizardErrorResponse() {
		
	}

	public WizardErrorResponse(int status, String message) {
		this.status = status;
		this.message = message;
	
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}







