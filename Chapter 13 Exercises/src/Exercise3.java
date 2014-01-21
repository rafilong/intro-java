/*
 * Chapter 13
 * Exercise 3
 * 
 * Write a method called handScore that takes an array of cards as an argument and that returns the total score. 
 */

public class Exercise3 {
int suit, rank;
	
	//calculating the score by adding each card to an int, with the exception of face cards where 10 is added
	public static int handScore(Exercise3[] hand) {
		int score = 0;
		for (int i = 0; i < hand.length; i++) {
			if (hand[i].rank < 11) {
				score += hand[i].rank;
			} else {
				score += 10;
			}
		}
		return score;
	}
	
	public static void main(String args[]) {
		//a bunch of cards to test with
		Exercise3 Ace = new Exercise3(1, 1);
		Exercise3 King = new Exercise3(1, 13);
		Exercise3 Ten = new Exercise3(1, 10);
		
		//making an array of the cards
		Exercise3[] hand = {Ace, King, Ten};
		
		//printing the score
		System.out.println(handScore(hand));
	}
	
	//a constructor to make "cards", which are called Exercise3
	public Exercise3 (int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

}
