package week3classmethodsexamples;

import java.util.Scanner;

public class week3menudrivenappvideo {

	static Scanner s = new Scanner (System.in);  // here is where we can get user input
	// and it's outside of our MAIN method so it is accessible everywhere 
	//anything inside our CLASS - public class, and outside the main method
	//will be accessible in all our methods 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // add team member
		//view team member
		//view all team members
		// delete team member by position
		// delete all team members 
		
		String [] team = new String[5];  //here is an array for our list of team members
		
		//THEN import our scanner .... up above 
		int decision = 0;         //then we need this variable to store what our user inputs
		
	//then create a while loop which will keep the app running while the user is still using 
		
		while (decision != -1) {
			showMenu();       //here is what we display what the user will see
			         //top down approach we will implement the methods after
			decision = s.nextInt();  //then based on the decision we want to DO something with that decision 
			//this will take whatever the decision is
			if (decision < -1 || decision > 5) { // this makes sure decisions 1-5 are included 
				System.out.println("Please pick a valid option.");
				
		}  else if (decision ==1 ) {// for option 1 we want to show the team
			showTeam(team);        //so we will pass our showTeam array into this method
		} else if (decision ==2) {
		showTeamMember(team );    //option 2 we need to show an individual team member define position
	} else if (decision ==3 ) {    //using the top down approach - at first all of these methods
		        // are underlined in red because we haven't defined them yet
		       //you can just hover over it and it will create a method for you! 
		//addTeamMember(team);
	} else if (decision ==4) {
		//deleteTeamMember(team);
	} else  {
		//deleteAllTeamMembers(team);
	}
		}
		
	}
	
	

	
	private static void showTeam(String[] team) { //computer made this one and it knew string was an array []
		// TODO Auto-generated method stub
		System.out.println("Team");
		//for (String member : team ) { //for each member in team, we want to print out their name
		//	System.out.println(member); //but the problem here is that we want i to keep track of the 
			// member position, so we would need a traditional for loop for this, not an enhanced loop 
		for (int i = 0; i < team.length; i++) {
				System.out.println(i + ": " + team[i]); //i will print out the element, which is team member 1-4 and then 
				// team [i] will print out the element at that position of the array!
	
	}
	}
	
	public static void showTeamMember(String[] team) {
		System.out.print("Which team member would you like to see?"); // here we prompt user for what we want them to type 
		int teamNumber = s.nextInt();     //here we need to declare the variable where the user inputs
		System.out.println(teamNumber + ": " + team[teamNumber]);
		
	}
	
	
	 public static void showMenu () {    //'show menu' is void because it doesn't take anything and it won't return anything
		 //and it doesn't need any parameters
		 System.out.println("Please pick an option or enter -1 to exit.");
		 System.out.println("1) Show Team");
		 System.out.println("2) Show Team member");
		 System.out.println("3) Add a team member");
	     System.out.println("4) Delete team member");
	     System.out.println("5) Delete all team members");
	 }  // test app at this point to make sure the menu appears correctly, and it does
		// not we need to DO something based on these options
	   // so add our if/else  statements up above - part of the while loop 
		
		
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	

		

		
	

