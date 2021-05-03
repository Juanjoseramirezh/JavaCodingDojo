package com.juanjose.zooguard2;

import com.juanjose.zooguard.Mammal;

public class Dragon extends Mammal {
	public Dragon() {
		super();
		this.energyLevel = 300;
	}
	
	public Dragon(int energyLevel) {
		super(energyLevel);
		
	}

	public void fly() {
		this.energyLevel -=50;
		System.out.println("FLAP FLAP! FUUUMM!! HP: " + energyLevel);
	}

	public void eatHuman() {
		this.energyLevel +=25;
		System.out.println("YUMMY YUMMY!! HP: " + energyLevel);
	}

	public void attackTown() {
		this.energyLevel -=100;
		System.out.println("CRASH CRASH!! (FIRE FIRE) HP: " + energyLevel);
		
	}
}
