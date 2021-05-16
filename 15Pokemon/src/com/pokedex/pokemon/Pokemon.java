package com.pokedex.pokemon;

public class Pokemon {

	// MEMBER VARIABLE
	private String namePokemon;
	private int healthPokemon = 0;
	private String typePokemon;

	// MEMBER VARIABLE STATIC
	private static int numeroDePokemonRegistrados;
	
	// CONSTRUCTORS
	/*public Pokemon() {
		this.namePokemon = "Name here";
		this.healthPokemon = 100;
		this.typePokemon = "Type here";
		numeroDePokemonRegistrados++;
	}*/
	
	public Pokemon(String namePokemon, int healthPokemon, String typePokemon) {
		
		this.namePokemon = namePokemon;
		this.healthPokemon = healthPokemon;
		this.typePokemon = typePokemon;
		numeroDePokemonRegistrados++;
	}

	// GETTER AND SETTER METHODS
	public String getNamePokemon() {
		return namePokemon;
	}

	public void setNamePokemon(String namePokemon) {
		this.namePokemon = namePokemon;
	}

	public int getHealthPokemon() {
		return healthPokemon;
	}

	public void setHealthPokemon(int healthPokemon) {
		this.healthPokemon = healthPokemon;
	}

	public String getTypePokemon() {
		return typePokemon;
	}

	public void setTypePokemon(String typePokemon) {
		this.typePokemon = typePokemon;
	}
	
	public static int getNumeroDePokemonRegistrados(){
		return numeroDePokemonRegistrados;
	}
	
	
	public static void setNumeroDePokemonRegistrados(int numeroDePokemonRegistrados) {
		Pokemon.numeroDePokemonRegistrados = numeroDePokemonRegistrados;
	}

	// OTHER METHODS
	
	/*public void attackPokemon(Pokemon pokemon) {
		System.out.println("Atacan al pokemon " + pokemon);
		pokemon.setHealthPokemon(pokemon.getHealthPokemon() - 10);
	}*/

}
