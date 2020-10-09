package com.hibernate.otm.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateProfessor {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Professor.class)
								.addAnnotatedClass(ProfessorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
	
		Session session = factory.getCurrentSession();
		
		try {			
			
				
			Professor professor = new Professor("Severus", "Snape", "severus.snape@hogwarts.com");
			
			ProfessorDetail professorDetail = new ProfessorDetail("http://www.youtube.com/hogwarts","Potion Maker");		
			
		
			professor.setProfessorDetail(professorDetail);
			
			session.beginTransaction();
			session.save(professor);					
			
		
			session.getTransaction().commit();
			
		}
		finally {
			
			session.close();
			
			factory.close();
		}
	}

}




