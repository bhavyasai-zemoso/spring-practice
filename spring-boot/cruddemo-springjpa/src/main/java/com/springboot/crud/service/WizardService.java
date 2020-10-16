package com.springboot.crud.service;

import java.util.List;

import com.springboot.crud.entity.Wizard;


public interface WizardService {
public List<Wizard> findAll();
	
	public Wizard findById(int id);
	
	public void saveWizard(Wizard wizard);
	
	public void deleteById(int id);
}
