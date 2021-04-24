package org.puzzlejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
	public void puzzle01() {

		int[] lista = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
		ArrayList<Integer> lista2 = new ArrayList<>();
		int sum = 0;

		for (int i = 0; i < lista.length; i++) {
			sum += lista[i];
		}

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] > 10) {
				lista2.add(i);
			}
		}

		System.out.println("la suma de los arrays es: " + sum);
		System.out.println("los valores mayores a 10: " + lista2);
	}

	public void puzzle02() {
		String[] names = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
		ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));

		ArrayList<String> newListOfNames = new ArrayList<>();

		Collections.shuffle(listOfNames);

		System.out.println("El arreglo de nombres desordenado: " + listOfNames);

		for (int i = 0; i < listOfNames.size(); i++) {
			if (listOfNames.get(i).length() > 5) {
				newListOfNames.add(listOfNames.get(i));
			}
		}
		System.out.println("Nombres con más de 5 caracteres" + newListOfNames);
	}

	public void puzzle03() {
		ArrayList<Character> alphabeticList = new ArrayList<>();
		ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

		for (char i = 'a'; i <= 'z'; i++) {
			alphabeticList.add(i);

		}

		Collections.shuffle(alphabeticList);

		System.out.println("la primera letra del abecedario: " + alphabeticList.get(0));

		/*
		 * if (alphabeticList.get(0) == 'a' || alphabeticList.get(0) == 'e' ||
		 * alphabeticList.get(0) == 'i' || alphabeticList.get(0) == 'o' ||
		 * alphabeticList.get(0) == 'u') {
		 * System.out.println("la primera letra es una vocal"); } else {
		 * System.out.println("no es una vocal"); }
		 */

		if (vowels.contains(alphabeticList.get(0))) {
			System.out.println("la primera letra es una vocal");
		} else {
			System.out.println("no es una vocal");
		}

	}
	
	public void puzzle04(int desde, int hasta) {
		ArrayList<Integer> num = new ArrayList<>();
		Random rnd = new Random();
		
		for ( int i = 0; i < 10; i++) {
			num.add(rnd.nextInt(hasta-desde) + desde);
			
		}
		System.out.println("los numeros aleatoreos son: "+num);
	}
	
	public void puzzle05(int desde, int hasta) {
		ArrayList<Integer> num = new ArrayList<>();
		Random rnd = new Random();
		for ( int i = 0; i < 10; i++) {
			num.add(rnd.nextInt(hasta-desde) + desde);	
		}
		Collections.sort(num);
		System.out.println("los numeros aleatoreos ordenados: "+num);
	}
	
	public void puzzle06() {
		
		Random rnd = new Random();
		char[] cadena = new char[5];
		
		for (int i = 0; i < 5; i ++) {
			cadena[i] = (char) (rnd.nextInt(26) + 97);	
		}
		
		System.out.print("la cadena " + cadena);
	}
	
	public void puzzle07() {
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i <10; i++) {
			System.out.println("las cadena "+i + " es: " + arr);
		}
		
	}
}
