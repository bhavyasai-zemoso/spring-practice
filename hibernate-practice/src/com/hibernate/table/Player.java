package com.hibernate.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="player")
public class Player {

	@Id
	@Column(name="_id")
	private int id;
	
	
	public Player() {
	}

	
	public Player(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
