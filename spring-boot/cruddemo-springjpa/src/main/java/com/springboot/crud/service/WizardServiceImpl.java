package com.springboot.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.dao.WizardRepository;
import com.springboot.crud.entity.Wizard;

@Service
public class WizardServiceImpl implements WizardService {

	private WizardRepository wizardRepository;
	
	@Autowired
	public WizardServiceImpl(WizardRepository theWizardRepository) {
		wizardRepository = theWizardRepository;
	}
	
	@Override
	public List<Wizard> findAll() {
		return wizardRepository.findAll();
	}

	@Override
	public Wizard findById(int theId) {
		Optional<Wizard> result = wizardRepository.findById(theId);
		
		Wizard theWizard = null;
		
		if (result.isPresent()) {
			theWizard = result.get();
		}
		else {

			throw new RuntimeException("Did not find wizard id - " + theId);
		}
		
		return theWizard;
	}

	@Override
	public void saveWizard(Wizard theWizard) {
		wizardRepository.save(theWizard);
	}

	@Override
	public void deleteById(int theId) {
		wizardRepository.deleteById(theId);
	}

}





