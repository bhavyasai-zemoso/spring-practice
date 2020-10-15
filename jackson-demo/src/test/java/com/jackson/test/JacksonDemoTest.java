package com.jackson.test;
import org.junit.Test;

import com.spring.jackson.demo.ObjectMapperDemo;

import static org.junit.Assert.*;
public class JacksonDemoTest {
	
	@Test
	public void testReadJsonWithObjectMapper() throws Exception{
		ObjectMapperDemo object = new ObjectMapperDemo();
		object.readJsonWithObjectMapper();
	}
}
