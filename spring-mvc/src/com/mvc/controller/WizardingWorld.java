package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WizardingWorld {
	
	@RequestMapping("/questionForm")
	public String questionForm(Model model) {
		model.addAttribute("character",new MovieCharacter());
		
		return "question";
	}
	
	
	@RequestMapping("/answerForm")
	public String answerForm() {
		return "answer";
	}
	
	
	@RequestMapping("/binaryAnswerForm")	
	public String convertToBinary(HttpServletRequest request, Model model) {
		
		
		String newCharacterName = request.getParameter("characterName");
		
		StringBuilder stringBuilder = new StringBuilder();

        for (char character : newCharacterName.toCharArray()) {
        	stringBuilder.append(Integer.toBinaryString(character) + "\n");
        }

        String out = stringBuilder.toString();
		
        model.addAttribute("message", out);
				
		return "answer";
	}
	
	
	@RequestMapping("/upperCaseAnswerForm")	
	public String convertToUpperCase(@RequestParam("characterName") String characterName,Model model) {
		
		characterName=characterName.toUpperCase();
		
		String result = "All in caps "+characterName;
		
        model.addAttribute("message", result);
				
		return "answer";
	}
}
