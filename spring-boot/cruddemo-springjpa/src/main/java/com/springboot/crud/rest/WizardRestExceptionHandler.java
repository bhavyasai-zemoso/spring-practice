package com.springboot.crud.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class WizardRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<WizardErrorResponse> handleException(WizardNotFoundException exc) {
		
		WizardErrorResponse error = new WizardErrorResponse(HttpStatus.NOT_FOUND.value(),exc.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	

	@ExceptionHandler
	public ResponseEntity<WizardErrorResponse> handleException(Exception exc) {
		
		WizardErrorResponse error = new WizardErrorResponse(HttpStatus.BAD_REQUEST.value(),exc.getMessage());
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}





