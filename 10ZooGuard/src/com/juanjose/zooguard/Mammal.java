package com.juanjose.zooguard;

public class Mammal {
	public int energyLevel = 100;

	public int displayEnergy() {
		System.out.println("El nivel de energia del mamifero es:" + energyLevel);
		return energyLevel;
	}
}