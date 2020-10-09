package com.hibernate.oto.bi;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDeveloperDetail {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Developer.class)
								.addAnnotatedClass(DeveloperDetail.class)
								.buildSessionFactory();
	
		Session session = factory.getCurrentSession();
		
		try {			
			
			session.beginTransaction();
			
			int theId = 4;
			DeveloperDetail developerDetail = session.get(DeveloperDetail.class, theId);
			developerDetail.getDeveloper().setDeveloperDetail(null);
			session.delete(developerDetail);
			session.getTransaction().commit();
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			session.close();
			
			factory.close();
		}
	}

}




