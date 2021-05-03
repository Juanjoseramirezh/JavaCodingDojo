package com.juanjose.maestroobjetoparte2;

import com.juanjose.maestroobjeto.Human;

public class Samurai extends Human {

	// MEMBER VARIABLE
	public Samurai() {
		this.health = 200;
	}

	// OTHER METHODS
	public void deathBlow(Human opponent) {
		System.out.println("Samurai: Terminemos esto!");
		opponent.setHealth(0);
		this.health = this.health/2;
	}
	public void meditate() {
		System.out.println("Samurai: OOOOOHHHMMM");
		this.health = this.health/2 + this.health;
	}
	
	public void howMany() {
		System.out.println("Samurai HP: " + this.health);
	}
}
