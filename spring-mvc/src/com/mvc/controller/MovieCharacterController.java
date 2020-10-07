package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wizard")
public class MovieCharacterController {
	
	@RequestMapping("/surveyForm")
	public String surveyForm(Model model) {
		
		model.addAttribute("character",new MovieCharacter());
		return "survey-form";
	}
	
	@RequestMapping("/surveyProcessForm")
	public String surveyProcessForm(@ModelAttribute("character") MovieCharacter character){
		return "survey-details-form";
	}
}
	