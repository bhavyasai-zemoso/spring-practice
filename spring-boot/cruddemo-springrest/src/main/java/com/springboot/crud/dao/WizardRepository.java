package com.springboot.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crud.entity.Wizard;


public interface WizardRepository extends JpaRepository<Wizard, Integer> {

	
}
