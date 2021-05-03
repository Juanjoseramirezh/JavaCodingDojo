package com.juanjose.maestroobjetoparte2;

import com.juanjose.maestroobjeto.Human;

public class Ninja extends Human {
	// MEMBER VARIABLE
	public Ninja() {
		this.stealth = 10;
	}

	// OTHER METHODS
	public void steal(Human opponent) {
		System.out.println("Ninja: te robo energia <3");
		opponent.setHealth(opponent.getHealth() - this.stealth);
		this.health+=this.stealth;
	}
	
	public void runAway() {
		System.out.println("Ninja: Adios popo! <3");
		this.health -= 10;
	}
	
	public void howMany() {
		System.out.println("Ninja HP: " + this.health);
	}
}
