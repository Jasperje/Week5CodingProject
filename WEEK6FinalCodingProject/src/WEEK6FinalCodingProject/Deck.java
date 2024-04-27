package WEEK6FinalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	
	
	
	public Deck() {
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] nameValues = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
				"Ten", "Jack", "Queen", "King", "Ace"}; 
		      int value = 2;
		   for (String suit : suits) {
			   value = 2;
		      for (String nameValue : nameValues) {
		    	  String name = nameValue + " of " + suit + " - Card Value: ";
				cards.add(new Card (value, name));
				value++;
			 
			 }
		 }
		
	}
	
	  public Card draw() {
		  return cards.remove(0);
	  }
	  
	  public void shuffle() {
		   Collections.shuffle(this.cards);    
	   }
	
	
	
}
