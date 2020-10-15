package com.spring.rest.restcontroller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.entity.Wizard;

@RestController
@RequestMapping("/api")
public class WizardRestController {

	
	@GetMapping("/wizards")
	public List<Wizard> getWizards() {

		List<Wizard> wizards = new ArrayList<>();
		
		wizards.add(new Wizard("Harry", "Potter"));
		wizards.add(new Wizard("Ron", "Weasley"));
		wizards.add(new Wizard("Hermoine", "Granger"));		
			
		return wizards;
	}
	
}









