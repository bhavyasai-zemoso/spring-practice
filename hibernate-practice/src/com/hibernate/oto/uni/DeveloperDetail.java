package com.hibernate.oto.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="developer_detail")
public class DeveloperDetail {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="github")
	private String github;
	
	@Column(name="customer")
	private String customer;

	public DeveloperDetail() {}

	public DeveloperDetail(String github, String customer) {
		this.github = github;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "DeveloperDetail [id=" + id + ", github=" + github + ", customer=" + customer + "]";
	}
	
	
}






