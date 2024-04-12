package WEEK5Labs;

public class Card {

	private String name;
	private String suit;
	private int value;
	
	public Card (String name, String suit, int value) { //three parameters -
		// one constructor for each of the fields in this class
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	public void describe() {  //this will print out the card that we draw
		System.out.println(this.name + " of " + this.suit + " --- " + this.value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
