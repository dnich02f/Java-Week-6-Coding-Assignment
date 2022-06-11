package week6CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		// Instantiate Deck and Two Players
		Deck deck1 = new Deck();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		
		// Call Shuffle Method from Deck Class
		deck1.shuffle();
		
		
		// Call Draw from Player Class 52 times -- Draw 52 cards, assign 1 
		// Card to Each Player with each loop
		for (int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck1);
			} else {
				player2.draw(deck1);
			}
		}
		

		// Call Flip from Player Class -- Flip 26 times
		for (int turn = 0; turn < 26 ; turn++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
		// Compare value of EACH card from each player and increment the score for
		// the player with the higher value
		if(card1.getValue() > card2.getValue()) {
			player1.incrementScore();
		} else if (card2.getValue() > card1.getValue()) {
			player2.incrementScore();
		}
		}
		
		// Loop through and compare final scores
		if(player1.getScore() > player2.getScore()) {
			player1.describe();
			player2.describe();
			System.out.println("Player 1 wins");
		} else if(player1.getScore() < player2.getScore()) {
			player1.describe();
			player2.describe();
			System.out.println("Player 2 wins");
		} else 
			System.out.println("Draw.");
	}

}
