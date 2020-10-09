package com.hibernate.eagerlazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {

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

			Query<Professor> query = session.createQuery("select i from Professor i " + "JOIN FETCH i.courses " + "where i.id=:professorId",Professor.class);

			query.setParameter("professorId", theId);
			
			Professor professor = query.getSingleResult();
			
			System.out.println(professor);	
			
			session.getTransaction().commit();
			
			
			session.close();
			
			System.out.println(professor.getCourses());
	
		}
		finally {
			
			session.close();
			
			factory.close();
		}
	}

}



