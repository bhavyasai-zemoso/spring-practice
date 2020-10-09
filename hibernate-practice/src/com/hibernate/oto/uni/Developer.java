package com.hibernate.oto.uni;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="developer")
public class Developer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="skill")
	private String skill;
	
	@Column(name="email")
	private String email;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="developer_detail_id")
	private DeveloperDetail developerDetail;


	public Developer() {
	}


	public Developer(String name, String skill, String email) {
		this.name = name;
		this.skill = skill;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public DeveloperDetail getDeveloperDetail() {
		return developerDetail;
	}


	public void setDeveloperDetail(DeveloperDetail developerDetail) {
		this.developerDetail = developerDetail;
	}


	@Override
	public String toString() {
		return "Developer [id=" + id + ", name=" + name + ", skill=" + skill + ", email=" + email + ", developerDetail="
				+ developerDetail + "]";
	}

	
}



