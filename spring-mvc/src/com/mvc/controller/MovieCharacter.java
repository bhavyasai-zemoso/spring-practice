package com.mvc.controller;

import java.util.LinkedHashSet;

public class MovieCharacter {
	private String characterName;
	
	private String favouritePart;

	private String professor;
	
private LinkedHashSet<String> professorOptions;
	
	public MovieCharacter() {
		
		professorOptions = new LinkedHashSet<>();
		professorOptions.add("Professor Quirrell");
		professorOptions.add("Gilderoy Lockhart");
		professorOptions.add("Remus Lupin");
		professorOptions.add("Mad-Eye Moody");
		professorOptions.add("Dolores Umbridge");	
		professorOptions.add("Severus Snape");	

	}
	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public LinkedHashSet<String> getProfessorOptions() {
		return professorOptions;
	}
	public String getFavouritePart() {
		return favouritePart;
	}
	public void setFavouritePart(String favouritePart) {
		this.favouritePart = favouritePart;
	}

}
