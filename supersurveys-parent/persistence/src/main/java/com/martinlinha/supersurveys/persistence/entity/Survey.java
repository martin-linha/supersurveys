package com.martinlinha.supersurveys.persistence.entity;

import javax.persistence.Entity;

@Entity
public class Survey extends BaseEntity {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
