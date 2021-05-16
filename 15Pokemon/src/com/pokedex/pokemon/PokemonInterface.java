package com.pokedex.pokemon;

public interface PokemonInterface {
	
	// METODOS DE LA INTERFACE
	Pokemon createPokemon(String namePokemon, int healthPokemon, String typePokemon);

	void pokemonInfo(Pokemon pokemon);

	void attackPokemon(Pokemon pokemon);
}
