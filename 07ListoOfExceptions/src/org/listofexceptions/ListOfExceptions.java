package org.listofexceptions;

import java.util.ArrayList;

public class ListOfExceptions {
	public void GenerateListOfExceptions() {
		ArrayList<Object> myList = new ArrayList<>();

		myList.add("13");
		myList.add("Hola Mundo");
		myList.add(48);
		myList.add("Adios Mundo");

		
		for (int i = 0; i < myList.size(); i++) {

			try {
				int castedValue = (Integer) myList.get(i);
				System.out.println("Posicion " + i);
				System.out.println(castedValue);

			} catch (ClassCastException e) {

				System.out.println("Posicion del error es: " + i);
				System.out.println("Catch la excepcion " + myList.get(i));
				// e.printStackTrace();

			}

		}

	}
}
