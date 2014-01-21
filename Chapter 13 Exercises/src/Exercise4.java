/*
 * Chapter 13
 * Exercise 4
 * 
 * Write a method called suitHist that takes an array of Cards as a parameter
 * and that returns a histogram of the suits in the hand. Your solution should only traverse the array once.
 * 
 * Write a method called hasFlush that takes an array of Cards as a parameter
 * and that returns true if the hand contains a flush, and false otherwise.
 */

public class Exercise4 {
int suit, rank;

	//makes an array of ints, that get added to when a card has a certain suit
	public static int[] suitHist(Exercise4[] hand) {
		int[] hist = new int[4];
		
		for (int i = 0; i < hand.length; i++) {
			if (hand[i].suit == 0) hist[0]++;
			if (hand[i].suit == 1) hist[1]++;
			if (hand[i].suit == 2) hist[2]++;
			if (hand[i].suit == 3) hist[3]++;
		}
		
		return hist;
	}
	
	public static boolean hasFlush(Exercise4[] hand) {
		//returns true if hist returns a value >= 5
		if (suitHist(hand)[0] >= 5) return true;
		if (suitHist(hand)[1] >= 5) return true;
		if (suitHist(hand)[2] >= 5) return true;
		if (suitHist(hand)[3] >= 5) return true;
		
		return false;
	}
	
	public static void main(String args[]) {
		//bunch of cards to test with
		Exercise4 Ace = new Exercise4(0, 1);
		Exercise4 King = new Exercise4(3, 13);
		Exercise4 Ten = new Exercise4(3, 10);
		Exercise4 Two = new Exercise4(2, 2);
		Exercise4 One = new Exercise4(3, 1);
		Exercise4 Four = new Exercise4(1, 4);
		Exercise4 Nine = new Exercise4(0, 9);
		Exercise4 Jack = new Exercise4(3, 11);
		Exercise4 Queen = new Exercise4(3, 12);
		
		//making a hand to test with
		Exercise4[] hand = {Ace, King, Ten, Two, One, Four, Nine, Jack, Queen};
		
		//printing whether or not there is a flush
		System.out.println("Flush is " + hasFlush(hand));
	}
	
	//a constructor to make "cards", which are called Exercise4
	public Exercise4(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
}
