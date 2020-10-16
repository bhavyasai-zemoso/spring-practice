package com.springboot.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.entity.Wizard;
import com.springboot.crud.service.WizardService;

@RestController
@RequestMapping("/api")
public class WizardRestController {

	
	@Autowired
	private WizardService wizardService;
	
	@GetMapping("/wizards")
	public List<Wizard> findAll() {
		return wizardService.findAll();
		
	}
	@GetMapping("/wizards/{wizardId}")
	public Wizard findWizard(@PathVariable int wizardId) {
		
		Wizard wizard = wizardService.findById(wizardId);
		if (wizard == null) {
			throw new WizardNotFoundException("Wizard id not found - " + wizard);
		}
		return wizard;
	}
	@PostMapping("/wizards")
	public Wizard saveWizard(@RequestBody Wizard wizard) {
		wizard.setId(0);
		wizardService.saveWizard(wizard);
		return wizard;
	}
	@PutMapping("/wizards")
	public Wizard updateWizard(@RequestBody Wizard wizard) {

		wizardService.saveWizard(wizard);
		return wizard;
	}
	
	@DeleteMapping("/wizards/{wizardId}")
	public String deleteWizard(@PathVariable int wizardId) {
		
		Wizard wizard = wizardService.findById(wizardId);
		
		if (wizard == null) {
			throw new WizardNotFoundException("Wizard id not found - " + wizardId);
		}	
		wizardService.deleteById(wizardId);
		return "Deleted wizard id - " + wizardId;
	}
	
	
}


















