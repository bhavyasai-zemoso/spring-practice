package com.hibernate.oto.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateDeveloper {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.addAnnotatedClass(DeveloperDetail.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {			
			
			/*Developer developer = new Developer("Harry", "Spring", "harry.potter@hogwarts.com");
			
			DeveloperDetail developerDetail = new DeveloperDetail("https://github.com/harry-potter","Google");	*/	
			
			Developer developer = new Developer("Ron", "React", "ron.weasley@hogwarts.com");
			
			DeveloperDetail developerDetail = new DeveloperDetail("https://github.com/ron-weasley","MS");
			
			developer.setDeveloperDetail(developerDetail);
			
			session.beginTransaction();
		
			session.save(developer);					
			
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}




