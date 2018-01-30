package com.project.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserBean {
	
	@NotEmpty
	String name;
	@NotNull
	@Min(value=12)
	@Max(value=120)
	int age;
	@NotEmpty
	@Email
	String email;
	@NotEmpty
	String country;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}
	
		public UserBean(String name, int age, String email, String country) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	

}
