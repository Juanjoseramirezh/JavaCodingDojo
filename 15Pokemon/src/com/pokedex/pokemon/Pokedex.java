package com.pokedex.pokemon;


public class Pokedex extends AbstractPokemon {

	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Name: " + pokemon.getNamePokemon() + " Health: " + pokemon.getHealthPokemon() + " Type: "
				+ pokemon.getTypePokemon());
	}


	/*
	 * private ArrayList<Pokemon> myPokemons;
	 * 
	 * 
	 * public Pokedex() { this.myPokemons = new ArrayList<>(); }
	 * 
	 * public void addPokemon(String namePokemon, int healthPokemon, String
	 * typePokemon) {
	 * 
	 * Pokemon p = this.createPokemon(namePokemon, healthPokemon, typePokemon);
	 * myPokemons.add(p);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public void listPokemon() {
	 * 
	 * for (int i = 0; i < Pokemon.getNumeroDePokemonRegistrados(); i++) {
	 * num.add(); } }
	 */

}
