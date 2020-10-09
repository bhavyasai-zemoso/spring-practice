package com.hibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Test {
	public static void main(String args[]) {
		
			String jdbcUrl="jdbc:mysql://localhost:3306/hibernate_practice?useSSL=false";
			String user="developer";
			String password="developer";
		try {
			System.out.println("Connectiong.........."+jdbcUrl);
			Connection con=DriverManager.getConnection(jdbcUrl,user,password);
			System.out.println("Connection success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
