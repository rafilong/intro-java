/*
 * Chapter 13
 * Exercise 1
 * 
 * Encapsulate the code in Section 13.5 in a method. Then modify it so that aces are ranked higher than Kings. 
 */
public class Exercise1 {
	int suit, rank;
	
	public static int compareCard(Exercise1 c1, Exercise1 c2) {
		//If the suits of the cards aren't equal, this will return which is higher.
		//if they are equal, then it will continue to rank
		if (c1.suit > c2.suit) return 1;
		if (c1.suit < c2.suit) return 2;
		
		//This returns a number if one of the variables is an ace and the other isn't
		if (c1.rank == 1 && c2.rank != 1) return 1;
		if (c2.rank == 1 && c1.rank != 1) return 2;
		
		//This compares the ranks
		if (c1.rank > c2.rank) return 1;
		if (c1.rank < c2.rank) return 2;
		
		//If both rank and suit are equal, then it will return 0
		return 0;
	}
	
	//constructor for the card type
	public Exercise1(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	//creating new objects and testing the method
	public static void main(String[] args) {
		Exercise1 card1 = new Exercise1(1, 10);
		Exercise1 card2 = new Exercise1(1, 9);
		
		System.out.println("Card " + compareCard(card1, card2) + " is larger");
	}

}
