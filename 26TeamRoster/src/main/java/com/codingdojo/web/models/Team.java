package com.codingdojo.web.models;

import java.util.ArrayList;

public class Team {

	// MEMBER VARIABLES
	private String teamName;
	

	private static ArrayList<Team> teams = new ArrayList<Team>();
	private ArrayList<Player> players = new ArrayList<>();

	// CONSTRUCTOR FROM SUPER CLASS
	public Team() {
		// super();
		// TODO Auto-generated constructor stub
	}

	// CONSTRUCTOR USING FIELS
	public Team(String teamName) {
		// super();
		this.setTeamName(teamName);
	}

	// MODELS TEAMS
	public static void addTeam(String teamName) {
		Team newTeam = new Team(teamName);
		Team.teams.add(newTeam);
	}
	// devolverá la posicion del arreglo
	public int getPosition() {
		return teams.indexOf(this);
	}

	// Models Player
	public void removeTeam(int index) {
		Team.teams.remove(index);
	}

	public void addPlayer(String firstName, String lastName, Integer age) {
		Player newPlayer = new Player(firstName, lastName, age);
		this.players.add(newPlayer);
	}

	
	// GETTER AND SETTER
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
	// GETTER AND SETTER STATICS!! 
	public static ArrayList<Team> getTeams() {
		return teams;
	}

	public static void setTeams(ArrayList<Team> teams) {
		Team.teams = teams;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
}
