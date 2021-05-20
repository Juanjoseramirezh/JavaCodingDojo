package com.codingdojo.web.models;

public abstract class Animal {
	// Member variables
	private String name;
	private String breed;
	private Double weigth;

	// Constructor from super class
	public Animal() {
		// super();
		// TODO Auto-generated constructor stub
	}

	// Constructor using fields
	public Animal(String name, String breed, Double weigth) {
		// super();
		this.name = name;
		this.breed = breed;
		this.weigth = weigth;
	}

	// GETTER AND SETTER
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Double getWeigth() {
		return weigth;
	}

	public void setWeigth (Double weigth) {
		this.weigth = weigth;
	}

	public String showAffection() {
		// TODO Auto-generated method stub
		return null;
	}

}
