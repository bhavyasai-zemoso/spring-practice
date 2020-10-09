package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateDeveloper {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			Developer developer = new Developer("Harry", "Javascript", "harry.potter@hogwarts.com");
			Developer developer1 = new Developer("Ron", "React", "ron.weasley@hogwarts.com");
			session.beginTransaction();
			session.save(developer);
			session.save(developer1);
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
	}

}




