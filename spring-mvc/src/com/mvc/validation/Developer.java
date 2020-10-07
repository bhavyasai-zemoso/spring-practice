package com.mvc.validation;

import java.util.LinkedHashSet;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.validation.custom.DeveloperCode;

public class Developer {
	
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String developerName;
	 
	@NotNull(message="required")
	@Size(min=1, message="required")
	private String developerType;
	

	@Max(value=10,message="invalid")
	private Integer mobileNumber;
	
	@Pattern(regexp="^[a-zA-Z0-9+.-]+@[a-zA-Z0-9.-]+$", message="invalid email")
	private String email;
	
	@DeveloperCode
	private String developerCode;
	
	private LinkedHashSet<String> professorOptions;
	
	public Developer() {
		
		professorOptions = new LinkedHashSet<>();
		professorOptions.add("Android Developer");
		professorOptions.add("Web Developer");
		professorOptions.add("Ios Developer");

	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public String getDeveloperType() {
		return developerType;
	}

	public void setDeveloperType(String developerType) {
		this.developerType = developerType;
	}

	public LinkedHashSet<String> getProfessorOptions() {
		return professorOptions;
	}

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDeveloperCode() {
		return developerCode;
	}

	public void setDeveloperCode(String developerCode) {
		this.developerCode = developerCode;
	}
	
	
	
}
