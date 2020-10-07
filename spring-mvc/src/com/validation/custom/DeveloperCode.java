package com.validation.custom;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = DeveloperCodeValidator.class)
@Target({ElementType.METHOD , ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DeveloperCode {
	
		public String value() default "DEV";
		
		
		public String message() default "starts with DEV";
		
		public Class<?>[] groups() default {};
		public Class<? extends Payload>[] payload() default {};
		
}
