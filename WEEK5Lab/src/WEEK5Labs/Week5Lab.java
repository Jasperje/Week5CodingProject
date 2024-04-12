package WEEK5Labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week5Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
			// This Lab will give you a basic look at creating an Object Oriented Card Game.  
			//		The idea here is to prepare you for your Week 6 Unit Final Project.
			//		There are many ways to implement this Lab, please use the tools that you know,
			//		and go from there.
			// These exercises are intended to be coded in order 1 through 5.
				
			
			
				// A standard deck of playing cards has 52 cards as specified below 
				//		i. There are 4 suits:  Clubs, Diamonds, Hearts, & Spades
				//				
				//	   ii. Each suit has 13 cards:  Two, Three, Four, Five, Six, Seven, 
				//									 Eight, Nine, Ten, Jack, Queen, King & Ace
				//
				//	  iii. Comparing Cards:  When comparing two cards, Ace is high and Two is low.
				//							 to make this easy, a Two will have a value of 2, a
				//							 Three will have a value of 3, ... and an Ace will have
				//							 a value of 14.
				//
			
				
				// 1. Card Class:
				//		Create a class called Card to represent a standard playing card. 
				//		Fields:   The Card class should have the following fields:
				// 			a. name field
				//			b. suit field
				//			c. value field for comparing against other cards.
				//
				//		Methods:  This class can have any useful method.
				//			a. describe() to display the card information to the Console.
				//			b. Getters & Setters 
				//
				   System.out.println("\nQuestion 1: Card Class");
				// Add your code here to instantiate a Card
				
				
				// Call the describe method on the newly instantiated card.
				       Card card = new Card("Two", "Hearts", 2);
				       card.describe();
				       
				       
				
				
		
				
				
				

				// 2. Deck Class:
				//		Create a class called Deck.
				//		Fields:  This class should have a list of Card field called cards 
				//				 that will hold all the cards in the deck. 
				//			List<Card> cards = new ArrayList<Card>(); 
				//
				//		Constructor: The constructor for the Deck Class should
				// 			instantiate all 52 standard playing cards and add them to the cards list.
				//
				//		Methods:  
				//			a.  describe() to describe the deck to the Console -- 
				//					print out all of the cards in the deck.
				//
				System.out.println("\nQuestion 2: Deck Class");
			    // Add your code here to instantiate a Deck	
			    Deck deck = new Deck();
			    deck.describe();
			    
			    // Call the describe method on the newly instantiated deck.
			    
			    
			    
			    
				
				
				// 3. Deck shuffle() Method:
				//		Add a shuffle method within the Deck Class
				System.out.println("\nQuestion 3: Deck shuffle() method");
				// Test your method here
				deck.shuffle();
				
				
				// Call the describe method on the newly shuffled deck.
				deck.describe();
  
				
				
				
				// 4. Deck draw() Method:
				//		Add a draw method within the Deck Class
				System.out.println("\nQuestion 4: Deck draw() method");
				// Test your method here
				Card drawnCard = deck.draw();
				drawnCard.describe();
				
				
				
				
				
				
				
				
				// 5. Create Game Board:
				//		Create and test a method that takes an int as a parameter (representing the
				// 			number of players for a game) and returns a Map<String, List<Card>>
				// 			that represents each player (i.e. "Player 1", "Player 2", etc..) 
				//			and their cards.
				//
				// 			The method should create a new instance of Deck, shuffle it,
				// 			and deal the cards out to the "players" in the Map.
				System.out.println("\nQuestion 5: Create Game");
				// Call your method here
				int numberOfPlayers = 5;
				Map<String, List<Card>> gameBoard = letsPlay(numberOfPlayers);
				
				
				
				// NO IDEA
				// why we need another for loop here when we wrote like
				//a million loops inside the method itself
				for (int i = 1; i <= numberOfPlayers; i++) {
					String playerName = "Player " + i;
					System.out.println(playerName + "\n--------");
					List<Card> playerList = gameBoard.get(playerName);
					for (Card handCard : playerList) {
						handCard.describe();
					}
				}
				
				
			}// end of main 
			
	
			// Method 5:
			
			public static Map<String, List<Card>> letsPlay (int numberOfPlayers) {
				
				Map<String, List<Card>> finalGameBoard = new HashMap<>();
				Deck deck = new Deck();
				deck.shuffle();  //this is a DIFF instance of a deck that we've
				//created WITHIN this method
				System.out.println("The deck has " + deck.getCards().size() + " cards.");
				
				for (int i = 1; i <= numberOfPlayers; i++) {
					List<Card> playerList = new ArrayList<>();
					String playerName = "Player "+ i;
					finalGameBoard.put(playerName, playerList);
				}
				// we need a nested for loop, to loop through the deck of cards and deal
				for (int i = 0; i < 52/numberOfPlayers; i++) {
				   for (int j = 1; j <= numberOfPlayers; j++) {    //ANOTHER loop that will loop through the # of players
					   String playerName = "Player "+ j;        //creates a for loop for # of players
					   List<Card> playerList = finalGameBoard.get(playerName);
					   playerList.add(deck.draw());       //this adds a card to the list for each player (in their hand)
					   finalGameBoard.replace(playerName, playerList);  //then replace for each card removed
					   
				   }
					
				}
				
				if (52%numberOfPlayers != 0) {
					System.out.println("With " + numberOfPlayers + " players -- ");
					System.out.println("Cards left in deck: " + 52%numberOfPlayers);
				} else {
					System.out.println("All cards have been dealt.");
				}
				return finalGameBoard;
				
				
				
			}
			

			
		

		
		
		
		
		
		
		
		
		
		
	}


