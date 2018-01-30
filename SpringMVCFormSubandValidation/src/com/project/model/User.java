package com.project.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;




public class User {

	@NotEmpty(message="User should not Empty")
	String name;
	@NotEmpty(message="Email should not Empty")
	@Email(message="Please Enter valid Email")
	String email;
	@NotEmpty(message="Country should not Empty")
	String country;
	@Max(message="Age should less than 120", value = 120)
	@Min(message="Age should be greate than 12", value=12)
	@NotNull
	int age;

	
	
	public User(String name, String email, String country, int age) {
		super();
		this.name = name;
		this.email = email;
		this.country = country;
		this.age = age;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
