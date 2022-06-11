package week6CodingAssignment;

public class Card {

	
	/*
	 * Fields
	 */
	
	private int value;
	private String name;
	
	
	/*
	 * Constructor
	 */
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	
	/*
	 * Methods
	 */
	// "I am a 2 of CLubs"
	public void describe() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return value + " of " + name;
	}
	
	
	/*
	 * Getters and Setters
	 */

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}
