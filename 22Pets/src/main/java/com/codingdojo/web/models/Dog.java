package com.codingdojo.web.models;

public class Dog extends Animal implements Pet {

	public Dog(String name, String breed, double weigth) {
		super(name, breed, weigth);
	}

	@Override
	public String showAffection() {
		if(this.getWeigth() >= 30) {
			return this.getName() + " have them curl up next to you!";
		}
		else {
			return this.getName() + " have then hop into you!";
		}
	}

}
