package com.spring.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.hibernate.dao.WizardDAO;
import com.spring.hibernate.entity.Wizard;

@Service
public class WizardServiceImpl implements WizardService{

	
	@Autowired
	private WizardDAO wizardDAO;
	
	@Override
	@Transactional
	public List<Wizard> getWizards() {
		
		return wizardDAO.getWizards();
	}

	@Override
	@Transactional
	public void saveWizard(Wizard wizard) {

		wizardDAO.saveWizard(wizard);
	}

	@Override
	@Transactional
	public Wizard getWizard(int id) {
		return wizardDAO.getWizard(id);
	}

	@Override
	@Transactional
	public void deleteWizard(int id) {
		wizardDAO.deleteWizard(id);
		
	}
}
