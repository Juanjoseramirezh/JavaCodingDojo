package com.juanjose.maestroobjeto;

public class Human {
	// MEMBER VARIABLE
	public int strength = 3;
	public int stealth = 3;
	public int inteligence = 3;
	public int health = 100;

	// GETTER AND SETTER
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getInteligence() {
		return inteligence;
	}

	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	// OTHER METHODS
	public void attack(Human opponent) {
		opponent.setHealth(opponent.getHealth() - this.strength);
	}

	public int displayHealth() {
		System.out.println("Los puntos de salud son: " + health);
		return health;
	}

}
