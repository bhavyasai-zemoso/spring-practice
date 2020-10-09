package com.hibernate.otm.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourses{

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
			
			Course course1 = new Course("Potion Making");
			Course course2 = new Course("Patronous Practice");
			
		
			professor.add(course1);
			professor.add(course2);
			
			
			session.save(course1);
			session.save(course2);
			
			
			session.getTransaction().commit();
			
		}
		finally {
			
			
			session.close();
			
			factory.close();
		}
	}

}



