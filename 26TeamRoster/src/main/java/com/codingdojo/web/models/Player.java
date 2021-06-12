package com.codingdojo.web.models;

public class Player {
	// MEMBER VARIABLES
	private String firstName;
	private String lastName;
	private Integer age;
	
	// CONSTRUCTOR FROM SUPER CLASS
	public Player() {
		//super();
		// TODO Auto-generated constructor stub
	}

	// CONSTRUCTOR USING FIELDS
	public Player(String firstName, String lastName, Integer age) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	
	// GETTER AND SETTER
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	
}
