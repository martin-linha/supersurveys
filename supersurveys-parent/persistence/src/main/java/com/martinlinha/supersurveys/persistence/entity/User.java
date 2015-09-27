package com.martinlinha.supersurveys.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "app_user")
public class User extends BaseEntity {

	@NotEmpty
	@Email
	@Column(nullable = false)
	private String email;
	@NotEmpty
	@Column(nullable = false)
	private String firstName;
	@NotEmpty
	@Column(nullable = false)
	private String lastName;
	@NotEmpty
	private String password;

	@OneToMany(mappedBy = "creator")
	private List<Question> questions;
	@OneToMany(mappedBy = "creator")
	private List<Survey> surveys;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
