package com.pokedex.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	
	public Pokemon createPokemon(String namePokemon, int healthPokemon, String typePokemon) {
		Pokemon pokemon1 = new Pokemon(namePokemon, healthPokemon, typePokemon);
		return pokemon1;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		System.out.println("Atacan al pokemon " + pokemon.getNamePokemon());
		pokemon.setHealthPokemon(pokemon.getHealthPokemon() - 10);
	}

}
