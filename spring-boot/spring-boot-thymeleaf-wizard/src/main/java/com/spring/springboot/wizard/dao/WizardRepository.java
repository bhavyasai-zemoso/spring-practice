package com.spring.springboot.wizard.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.springboot.wizard.entity.Wizard;



public interface WizardRepository extends JpaRepository<Wizard, Integer> {
	
	public List<Wizard> findAllByOrderByLastNameAsc();
	
}
