package Week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamMenuApp {

	
	
	 static Scanner scanner = new Scanner(System.in);
	 static List<Team> teams = new ArrayList<Team>();
	 
	    
	
	public static void main(String[] args) {
		
		int decision = 0;
		while (true) {
			printOptions();
			decision = scanner.nextInt();  // this oNLY allows user to type an int option
			if (decision == 1) {
				teams.add(createNewTeam());
			} else if (decision == 2) {
				addPlayerToTeam();
			} else if (decision == 3) {
				removePlayerFromTeam();
			} else if (decision == 4) {
				describeTeam();
			} else {
				 System.out.println("Please pick a valid option");
			}
		}

		//we can even have a LIST of lists 
		//List<List<String>> teams;
		
		//Player p1 = new Player("Thomas", "Fullback", "Running Fast");
		//Player p2 = new Player("Sally", "Quarterback", "Throwing far");
		
		//Team team = new Team("Really Good Football Team");
		///team.addPlayer(p1);
		//team.addPlayer(p2);
		//team.describe();
		
		//team.removePlayer("Thomas");
		//team.describe();
		
	}








	private  static void printOptions() {
          System.out.println("1: Create New Team");
          System.out.println("2: Add Player To Team");
          System.out.println("3: Remove Player From Team");
          System.out.println("4: View Team Info");
          
	}
	
	private static void describeTeam() {
		printTeamNames();
		System.out.println("Which team would you like to see information for? ");
		String teamName = scanner.next() ;
		try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.describe();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	private static Team createNewTeam() {
		 System.out.print("Enter name of the team you want to create (enter name with NO spaces): ");
          String name = scanner.next();	
          return new Team(name);
	}
	

	private static void addPlayerToTeam() {
		 printTeamNames();
		 System.out.print("Enter name of the team you wish to add a player to: ");
		 String teamName = scanner.next();
		 try {
			Team foundTeam = findTeamByName(teamName);
			foundTeam.addPlayer(createNewPlayer());
		} catch (Exception e) {
			System.out.println(e.toString());
			
		}   
		 // this will find the team name so we can
		 // add the player we're about to create to this team
	}
	
	private static void removePlayerFromTeam () {
		printTeamNames();
		System.out.println("Enter name of the team you wish to remove a player from: ");
		String teamName = scanner.next();
		try {
			Team foundTeam = findTeamByName(teamName);
			// we can print out all the player names here so we see 
			//all the possibilities of players we can remove
			foundTeam.describe(); //will print out all the players
			System.out.println("Which player would you like to remove? ");
		   String playerName = scanner.next();
		   foundTeam.removePlayer(playerName);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	private static Player createNewPlayer() {
		System.out.println("Enter player name: ");
		 String name = scanner.next();
		System.out.println("Enter player position: ");
		 String position = scanner.next();
		System.out.println("Enter player specialty: ");
		 String specialty = scanner.next();
		 return new Player (name, position, specialty); 
		 //pass the variable in to the return statement
		 // in the parameters of the constructor
	}
	
	private static void printTeamNames() {
		for (Team team : teams) {
			System.out.println(team.getName());
		}
	}
	
	private static Team findTeamByName(String name) throws Exception {
		for (Team team : teams) {
			if (team.getName().equals(name)) {   //will only return if the team is a valid team name 
				return team;                // and wil throw an exception if it is not found
			}
		}
			throw new Exception("Team not found: " + name) ;  
			
	
	
	}
}
