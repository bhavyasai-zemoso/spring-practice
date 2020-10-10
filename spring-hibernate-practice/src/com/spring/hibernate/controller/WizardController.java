package com.spring.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.hibernate.entity.Wizard;
import com.spring.hibernate.service.WizardService;

@Controller
@RequestMapping("/wizard")
public class WizardController {

	
	@Autowired
	private WizardService wizardService;
	
	@GetMapping("/list")
	public String listWizards(Model model) {
		
		List<Wizard> wizards = wizardService.getWizards();
		model.addAttribute("wizards",wizards);
		return "list-wizards";
	}
	
	
	@GetMapping("/addSorcerer")
	public String addSorcerer(Model model) {
		
		Wizard wizard = new Wizard();
		
		model.addAttribute("wizard", wizard);
		
		return "add-sorcerer-form";
	}
	
	@PostMapping("/saveWizard")
	public String saveCustomer(@ModelAttribute("wizard") Wizard wizard) {
		wizardService.saveWizard(wizard);
		return "redirect:/wizard/list";
	}
		
	@GetMapping("/updateWizard")
	public String updateWizard(@RequestParam("wizardId") int id,Model model) {
		
		Wizard wizard = wizardService.getWizard(id);	
		model.addAttribute("wizard", wizard);
		
			
		return "add-sorcerer-form";
	}
	@GetMapping("/deleteWizard")
	public String deleteWizard(@RequestParam("wizardId") int id) {
		
		wizardService.deleteWizard(id);
		
		return "redirect:/wizard/list";
	}
}
