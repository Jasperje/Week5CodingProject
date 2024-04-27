package WEEK6FinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player  {

	
	
	   private String name;
	   private int score;
	   private List<Card> hand = new ArrayList<>();
		
	
	
	public void player (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	
	  public void decribe(Player player) {
		  System.out.println(player.getName() + "has these cards in their hand: " );
		for (Card card : hand) {
			card.describe();
		}
	}
		
		public Card flip () {
			return hand.remove(0);
		}
		
		public void draw (Deck deck) {
			hand.add(deck.draw());
			
		}
		
		public void incrementScore() {
			score++;
		}
		

		
	    public String getName() {
				return name;
		}
	    
		public void setName(String name) {
			this.name = name;
		}

		public int getScore() {
			return score;
		}


		
		
		
		
		
	}
	
	
	
	

