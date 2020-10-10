package com.spring.hibernate.service;

import java.util.List;

import com.spring.hibernate.entity.Wizard;


public interface WizardService {
	public List<Wizard> getWizards();
	public void saveWizard(Wizard wizard);
	public Wizard getWizard(int id);
	public void deleteWizard(int id);
}
