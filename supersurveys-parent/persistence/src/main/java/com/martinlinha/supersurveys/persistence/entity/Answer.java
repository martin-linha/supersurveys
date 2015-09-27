package com.martinlinha.supersurveys.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Answer extends BaseEntity {

	private String value;
	@ManyToOne
	private Question question;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
