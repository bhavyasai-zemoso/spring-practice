package com.spring.hibernate.rest;

public class WizardNotFoundException extends RuntimeException {

	public WizardNotFoundException() {
	}

	public WizardNotFoundException(String message) {
		super(message);
	}

	public WizardNotFoundException(Throwable cause) {
		super(cause);
	}

	public WizardNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public WizardNotFoundException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
