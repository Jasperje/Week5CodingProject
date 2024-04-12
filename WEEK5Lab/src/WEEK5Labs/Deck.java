package WEEK5Labs;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> cards = new ArrayList<Card>(); 
	
	
	//Constructor: The constructor for the Deck Class should
	// 			instantiate all 52 standard playing cards and add them to the cards list.
	//
	
	public Deck() {       //doesn't need any parameters because we're populating all 52 cards
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", 
				"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		 
		 for (String suit : suits) {
			 int count = 2;
			 for (String number : numbers) { //nested enhanced for loop!
				 // we want to instantiate a new card for each card.
				 Card card = new Card(number, suit, count);
				 this.cards.add(card);
				 count++;
			 }
		}
	}


	public List<Card> getCards() {
		return cards;
	}


	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}

   public void shuffle() {
	   Collections.shuffle(this.cards);    //a shuffle method already exists I guess?!
   }
	
   
	//here we write a draw method... 
   // this will remove a card from the deck and move it somewhere else (to the top?)
   
   public Card draw() {
	   Card card = this.cards.remove(0); //this will remove first card of deck
	   return card;
   }
	
	
	
	
	
	//		Methods:  
	//			a.  describe() to describe the deck to the Console -- 
	//					print out all of the cards in the deck.
	//
	
	
	
}
