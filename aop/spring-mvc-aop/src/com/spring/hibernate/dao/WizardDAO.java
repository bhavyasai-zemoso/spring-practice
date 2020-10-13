package com.spring.hibernate.dao;

import java.util.List;

import com.spring.hibernate.entity.Wizard;



public interface WizardDAO {

	public List<Wizard> getWizards();
	public void saveWizard(Wizard wizard);
	public Wizard getWizard(int id);
	public void deleteWizard(int id);
	
}
