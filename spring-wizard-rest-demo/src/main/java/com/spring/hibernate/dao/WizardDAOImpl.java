package com.spring.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.hibernate.entity.Wizard;

@Repository
public class WizardDAOImpl implements WizardDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
			
	@Override
	public List<Wizard> getWizards() {
		
		Session session = sessionFactory.getCurrentSession();
		Query<Wizard> query = session.createQuery("from Wizard", Wizard.class);
		List<Wizard> wizards = query.list();
		return wizards;	
	}

	@Override
	public void saveWizard(Wizard wizard) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(wizard);
		
	}

	@Override
	public Wizard getWizard(int id) {

				Session session = sessionFactory.getCurrentSession();
		
		Wizard wizard = session.get(Wizard.class,id);
		return wizard;
	}

	@Override
	public void deleteWizard(int id) {
		
			Session session = sessionFactory.getCurrentSession();
		
		
		Query query = session.createQuery("delete from Wizard where id=:wizardId");
		query.setParameter("wizardId", id);
		query.executeUpdate();		
	}		
	}







