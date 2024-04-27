package WEEK6FinalCodingProject;

public class App {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		System.out.println("Game ON!");
		System.out.println("* * * * * * * * * * * * * * * * *");
		
		 
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		 
		   Card player1Card = null;
		   Card player2Card = null;
		   
		for (int i = 0; i < 26; i++) {
			player1Card = player1.flip();
			player1Card.describe();
			
			player2Card = player2.flip();
			player2Card.describe();
			 
			
			if (player1Card.getValue() >  player2Card.getValue()) {
				player1.incrementScore();
				System.out.println("One point goes to Player 1!");
		   
		} else if   
			   (player2Card.getValue() >  player1Card.getValue()) {
				player2.incrementScore();
				System.out.println("One point goes to Player 2!");
		   
		} else { 
				System.out.println("The card values are equal - no point is awarded.");
		   
		}
			System.out.println("Player 1's current score is: " + player1.getScore());
			System.out.println("Player 2's current score is: " + player2.getScore());
            System.out.println("* * * * * * * * * * * * * * * * *");
           
			
	}
		if (player1.getScore() >  player2.getScore()) {
			System.out.println("Player 1 wins the game!");
	   
	} else if   
		   (player2.getScore() >  player1.getScore()) {
			System.out.println("Player 2 wins the game!");
	   
	} else { 
			System.out.println("It's a tie! No winner.");
	   
	}
		System.out.println("Player 1's final score is: " + player1.getScore());
		System.out.println("Player 2's final score is: " + player2.getScore());

		
	}

		
		

	
		
	} //end of class

