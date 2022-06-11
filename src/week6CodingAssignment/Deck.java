package week6CodingAssignment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class Deck extends LinkedList<Card> {

	/*
	 * Fields
	 */
	
	private List<String> names = List.of("Spades", "Clubs", "Hearts", "Diamonds");
	private List<Integer> values = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
	

	/*
	 * Constructor
	 */
	public Deck() {
		for (int namePos = 0; namePos < names.size(); namePos++) {
			String name = names.get(namePos); 
			for (Integer value : values) {
				add(new Card(value, name));
			} 
		}
	}
	
	
	/*
	 * Methods
	 */
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("List of cards: ").append(System.lineSeparator());
		for (Card card : this) {
			builder.append("    ").append(card).append(System.lineSeparator());
		}
		return builder.toString();
	}

	// shuffle method
	public void shuffle() {
		Collections.shuffle(this);
	}
	
	// draw method - removes and returns the top card of the Cards field
	public Card draw() {
		 Card topCard = this.remove();
		 return topCard;
	}
	
	
	
}
