package com.pokedex.pokemon;

public class PokemonTest extends Pokedex {

	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		Pokemon charmander = pokedex.createPokemon("Charmander", 100, "Fire");
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 50, "Electricity");
		Pokemon clefairy = pokedex.createPokemon(null, 0, null);
		
		pokedex.attackPokemon(charmander);
		pokedex.pokemonInfo(pikachu);
		pokedex.pokemonInfo(charmander);
		pokedex.pokemonInfo(clefairy);
		Pokemon.getNumeroDePokemonRegistrados();
		
		
	}

}
