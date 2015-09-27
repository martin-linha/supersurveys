package com.martinlinha.supersurveys.persistence.entity;

import javax.persistence.Entity;

@Entity
public class Answer {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
