package week6CodingAssignment;

import java.util.LinkedList;

public class Player {

private LinkedList<Card> hand = new LinkedList<Card>();
private int score;
private String name;



/*
 * Player Constructor -- set score to 0 in the constructor
 */

public Player(String name) {
	this.name = name;
	this.score = 0;
}


/*
 * Methods
 */

// return String representation of object
@Override
public String toString() {
	return name;
}

////
public void describe() {
	System.out.println(toString() + " has " + getScore() + " points.");
}

// takes a Deck as an argument and calls the draw method from the Deck Class on 
// the deck argument, adding the returned Card to the hand field
public void draw(Deck deck) {
	hand.add(deck.draw());
}

// flip method -- removes and returns the top card of the Hand of each player
public Card flip() {
	return hand.remove();
}

// incrementScore method -- adds 1 to the Players score
public void incrementScore() {
	score++;
}


/*
 * Getters 
 */
public LinkedList<Card> getHand() {
	return hand;
}

public int getScore() {
	return score;
}

public String getName() {
	return name;
}


}
