package com.martinlinha.supersurveys.persistence.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Survey extends BaseEntity {

	private String name;
	private List<Question> questions;
	
}
