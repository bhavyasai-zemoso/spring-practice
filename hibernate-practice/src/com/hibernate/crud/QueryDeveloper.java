package com.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class QueryDeveloper {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
			
			List<Developer> developerList = session.createQuery("from Developer").list();
			displayDevelopers(developerList);
			developerList = session.createQuery("from Developer d where d.skill='Spring' OR d.skill='React' AND email LIKE '%hogwarts.com'").list(); 
			displayDevelopers(developerList);
			session.getTransaction().commit();
		}
		
		finally {
			factory.close();
		}
	}

	private static void displayDevelopers(List<Developer> developerList) {
		for(Developer dev : developerList)
			System.out.println(dev);
	}

}



