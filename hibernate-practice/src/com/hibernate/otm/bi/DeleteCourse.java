package com.hibernate.otm.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourse {

	public static void main(String[] args) {

	
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Professor.class)
								.addAnnotatedClass(ProfessorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {			
			
		
			session.beginTransaction();
			Course course = session.get(Course.class, 10);
			session.delete(course);

			session.getTransaction().commit();
			
		}
		finally {
			
			session.close();
			
			factory.close();
		}
	}

}




