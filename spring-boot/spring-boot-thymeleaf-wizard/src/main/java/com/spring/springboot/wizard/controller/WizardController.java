package com.spring.springboot.wizard.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.springboot.wizard.entity.Wizard;
import com.spring.springboot.wizard.service.WizardService;

@Controller
@RequestMapping("/wizards")
public class WizardController {

	private WizardService wizardService;
	
	public WizardController(WizardService theWizardService) {
		wizardService = theWizardService;
	}
	

	@GetMapping("/list")
	public String listWizards(Model theModel) {
		
		List<Wizard> theWizards = wizardService.findAll();
		theModel.addAttribute("wizards", theWizards);
		return "wizards/list-wizards";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Wizard theWizard = new Wizard();
		theModel.addAttribute("wizard", theWizard);
		return "wizards/wizard-form";
	}

	@PostMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("wizardId") int theId,Model theModel) {
	
		Wizard theWizard = wizardService.findById(theId);
		theModel.addAttribute("wizard", theWizard);
		return "wizards/wizard-form";			
	}
	
	
	@PostMapping("/save")
	public String saveWizard(@ModelAttribute("wizard") Wizard theWizard) {
	
		wizardService.save(theWizard);
		return "redirect:/wizards/list";
	}
	
	
	@PostMapping("/delete")
	public String delete(@RequestParam("wizardId") int theId) {
		
		wizardService.deleteById(theId);
		return "redirect:/wizards/list";
		
	}
	
}

















