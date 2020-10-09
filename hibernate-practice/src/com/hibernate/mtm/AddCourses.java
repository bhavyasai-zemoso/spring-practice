package com.hibernate.mtm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddCourses {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Professor.class)
								.addAnnotatedClass(ProfessorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
				Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
			
			int studentId = 2;
			Student student = session.get(Student.class, studentId);
			
			Course course1 = new Course("Quidditch Practice");
			Course course2 = new Course("Defense against dark arts");
						
			
			course1.addStudent(student);
			course2.addStudent(student);
	
			
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




