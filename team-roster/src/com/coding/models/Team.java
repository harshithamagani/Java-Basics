package com.coding.models;

import java.util.ArrayList;

public class Team {
	private String team_name;
	private ArrayList<Player> team;
	
	public Team(String team_name, ArrayList<Player> team){
		this.team=team;
		this.team_name=team_name;
	}
	
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public ArrayList<Player> getTeam() {
		return team;
	}
	public void setTeam(ArrayList<Player> team) {
		this.team = team;
	}
	
}
