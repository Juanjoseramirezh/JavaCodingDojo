package com.juanjose.zooguard;

public class Gorilla extends Mammal {

	public void throwSomething() {
		int rock = 5;
		energyLevel = energyLevel - rock;
		System.out.println("Lanza una piedra, HP: " + energyLevel);
	}

	public void eatBananas() {
		int banana = 10;
		energyLevel = energyLevel + banana;
		System.out.println("Se comió una banana, HP: " + energyLevel);
	}

	public void climb() {
		int climber = 10;
		energyLevel = energyLevel - climber;
		System.out.println("Trepó un arbol, HP: " + energyLevel);
	}
	
}
