package com.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteDeveloper {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			session.createQuery("delete from Developer where id=4").executeUpdate();
		
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
	}

}