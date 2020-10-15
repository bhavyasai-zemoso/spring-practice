package com.spring.jackson.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperDemo {

	public Student readJsonWithObjectMapper() throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		Student theStudent = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
		System.out.println("First name = " + theStudent.getFirstName());
		System.out.println("Last name = " + theStudent.getLastName());
		Address tempAddress = theStudent.getAddress();
		System.out.println("Street = " + tempAddress.getStreet());
		System.out.println("City = " + tempAddress.getCity());
		for (String tempLang : theStudent.getLanguages()) {
			System.out.println(tempLang);
		}
		return theStudent;
	}
	
}


