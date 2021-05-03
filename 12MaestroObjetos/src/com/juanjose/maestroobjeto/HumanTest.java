package com.juanjose.maestroobjeto;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human humanTest1 = new Human();
		Human humanTest2 = new Human();
		
		humanTest1.attack(humanTest2);

		
		humanTest2.displayHealth();
		humanTest1.displayHealth();
	}

}
