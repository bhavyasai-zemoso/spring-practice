package com.hibernate.table;
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction; 
import org.hibernate.cfg.Configuration; 
public class AddToDB { 
	public static void main(String[] args) { 
		Configuration cfg=new Configuration(); 
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory(); 
		Session session=factory.openSession();  
		Transaction t=session.beginTransaction(); 
		Player e1=new Player (); 
		e1.setId(115); 
		session.save(e1);
		t.commit();
		session.close();
		System.out.println("created table"); 
	}
}
