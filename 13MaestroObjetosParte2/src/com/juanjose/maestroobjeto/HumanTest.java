package com.juanjose.maestroobjeto;

import com.juanjose.maestroobjetoparte2.Samurai;
import com.juanjose.maestroobjetoparte2.Wizard;
import com.juanjose.maestroobjetoparte2.Ninja;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Human humanTest1 = new Human();
		Human humanTest2 = new Human();
		
		humanTest1.attack(humanTest2);

		
		humanTest2.displayHealth();
		humanTest1.displayHealth();*/
		
		Samurai sam = new Samurai();
		Wizard wiz = new Wizard();
		Ninja nin = new Ninja();
		
		System.out.println("****** STAR *****");
		sam.howMany();
		wiz.howMany();
		nin.howMany();
		
		System.out.println("****** TURN MAGE *****");
		wiz.fireBall(sam);
		wiz.heal(nin);
		
		System.out.println("****** TURN NINJA *****");
		nin.steal(sam);
		nin.runAway();
		
		System.out.println("****** TURN SAMURAI *****");
		sam.deathBlow(wiz);
		sam.meditate();
		
		System.out.println("****** FINAL RESULT *****");
		sam.howMany();
		wiz.howMany();
		nin.howMany();
		
		
	}

}
