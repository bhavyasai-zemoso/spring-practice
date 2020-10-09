package com.hibernate.otm.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetCourseReviews{

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Professor.class)
								.addAnnotatedClass(ProfessorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		try {			
		
			session.beginTransaction();

			int id = 12;
			Course course = session.get(Course.class, id);
			System.out.println(course);
			System.out.println(course.getReviews());
			session.getTransaction().commit();
		}
		finally { 
			session.close();
			
			factory.close();
		}
	}

}




