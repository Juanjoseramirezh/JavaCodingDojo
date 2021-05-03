package com.juanjose.maestroobjetoparte2;

import com.juanjose.maestroobjeto.Human;

public class Wizard extends Human {

	// MEMBER VARIABLE
	public Wizard() {
		this.health = 50;
		this.inteligence = 8;
	}

	// OTHER METHODS
	public void heal(Human opponent) {
		System.out.println("Mage: Deja curarte!");
		opponent.setHealth(opponent.getHealth() + this.inteligence);
	}

	public void fireBall(Human opponent) {
		System.out.println("Mage: BUM a fire ball!!");
		opponent.setHealth(opponent.getHealth() - 3 * this.inteligence);
	}
	
	public void howMany() {
		System.out.println("Wizard HP: " + this.health);
	}
}
