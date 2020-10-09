package com.hibernate.otm.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseReviews{

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
			Course course = new Course("Potion Making");
			course.addReview(new Review("grab the Liquid Luck to win the Quidditch!!"));
			course.addReview(new Review("beware of poly juice potion!!"));
			System.out.println(course);
			System.out.println(course.getReviews());
			session.save(course);
			session.getTransaction().commit();
			
		}
		finally {
			session.close();
			
			factory.close();
		}
	}

}



