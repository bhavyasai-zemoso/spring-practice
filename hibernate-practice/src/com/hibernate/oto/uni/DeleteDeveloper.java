package com.hibernate.oto.uni;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDeveloper {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.addAnnotatedClass(DeveloperDetail.class)
								.buildSessionFactory();
		
	
		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
	
			Developer developer = session.get(Developer.class, 5);
			System.out.println("Found instructor: " + developer);
			
			if (developer != null) {
				session.delete(developer);				
			}
			
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}




