package com.juanjose.zooguard;

public class Mammal {
	
	//MEMBER VARIABLE
	protected int energyLevel;
	
	
	//CONSTRUCTORS
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	//GETTER AND SETTER
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
	}
	
	
	//OTHER METHOS
	public int displayEnergy() {
		System.out.println("El nivel de energia es:" + energyLevel);
		return energyLevel;
	}
}