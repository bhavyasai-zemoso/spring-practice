package com.hibernate.mtm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCourseStudents {

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
			
			Course course = new Course("Patronous Charm Practice");
					
			session.save(course);

			Student student1 = new Student("Harry", "Potter", "harry.potter@hogwarts.com");
			Student student2 = new Student("Ron", "Weasley", "ron.wealsey@hogwarts.com");
			
			course.addStudent(student1);
			course.addStudent(student2);
			
			session.save(student1);
			session.save(student2);
		
			session.getTransaction().commit();
			
		}
		finally {
			
			session.close();
			
			factory.close();
		}
	}

}




