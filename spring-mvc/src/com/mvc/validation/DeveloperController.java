package com.mvc.validation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/developer")
public class DeveloperController {

	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("developer", new Developer());
		
		return "ask-developer";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("developer") Developer theDeveloper,BindingResult theBindingResult) {
		System.out.println(theBindingResult);
		
		if (theBindingResult.hasErrors()) {
			return "ask-developer";
		}
		else {
			return "display-developer";
		}
	}
}








