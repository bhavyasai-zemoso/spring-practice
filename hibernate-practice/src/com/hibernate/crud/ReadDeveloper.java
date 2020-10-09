package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadDeveloper {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			Developer developer = new Developer("Snape", "Spring", "severus.snape@hogwarts.com");
			session.beginTransaction();
			System.out.println("before "+developer.getId());
			System.out.println(developer);
			session.save(developer);
		
			session.getTransaction().commit();
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("after "+developer.getId());
			Developer developerResult = session.get(Developer.class, developer.getId());
			System.out.println(developerResult);
			session.getTransaction().commit();
			
		}
		
		finally {
			factory.close();
		}
	}

}




