package com.validation.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DeveloperCodeValidator implements ConstraintValidator<DeveloperCode,String>{

private String codePrefix;
	
	public void initialize(DeveloperCode code) {
		codePrefix = code.value();
	}

	public boolean isValid(String code,ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result;
		if (code != null) 
			result = code.startsWith(codePrefix);	
		else 
			result = true;
		return result;
	}

}
