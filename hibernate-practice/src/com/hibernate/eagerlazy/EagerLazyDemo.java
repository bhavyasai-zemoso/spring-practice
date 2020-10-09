package com.hibernate.eagerlazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class EagerLazyDemo {

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
		
			int theId = 1;
			Professor professor = session.get(Professor.class, theId);		
			
			System.out.println(professor);
		
			System.out.println(professor.getCourses());
		
			session.getTransaction().commit();
		
			session.close();

		}
		finally {
			
			
			session.close();
			
			factory.close();
		}
	}

}




