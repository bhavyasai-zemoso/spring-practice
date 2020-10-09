package com.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UpdateDeveloper {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			Developer developer = session.get(Developer.class, 4);
			developer.setName("George");
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
	}

}




