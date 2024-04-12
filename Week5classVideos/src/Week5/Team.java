package Week5;

import java.util.ArrayList;
import java.util.List;

public class Team {

	
	
	private List<Player> players = new ArrayList<Player>();
	private String name;
	
	//constructor
	public Team(String name) {
		this.setName(name);
		
	}

	//a specific loop for doing something to each element in a collection
	// should signal to us we need an enhanced for loop
	public void describe() {
		System.out.println("Team name: " + name);
		for (Player player : players) {
			player.describe();
		}
	}
	public void addPlayer(Player player) {
		players.add(player);
		
	}
	
	public void removePlayer(String playerName) {
	    for (Player player : players) {             // we need a loop here because the name must be in the list of players
	    	if (player.getName().equals(playerName)) {
	    		players.remove(player);
	    	}
	    }
	}		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
