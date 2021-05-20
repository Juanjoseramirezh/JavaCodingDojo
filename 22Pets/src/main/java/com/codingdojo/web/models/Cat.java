package com.codingdojo.web.models;

public class Cat extends Animal implements Pet{

	public Cat(String name, String breed, double weigth) {
		super(name, breed, weigth);
	}


	@Override
	public String showAffection() {
		// TODO Auto-generated method stub
		return "Your " + this.getBreed() + " cat, " + this.getName()+ ", looked at you with some affection. You think." ;
	}

}
