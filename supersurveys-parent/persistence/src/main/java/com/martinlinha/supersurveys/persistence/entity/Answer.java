package com.martinlinha.supersurveys.persistence.entity;

import javax.persistence.Entity;

@Entity
public class Answer extends BaseEntity {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
