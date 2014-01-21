/*
 * Chapter 13
 * Exercise 2
 * 
 * Encapsulate the deck-building code of Section 13.6 in a method called makeDeck that takes
 * no parameters and returns a fully-populated array of Cards. 
 */

public class Exercise2 {
int suit, rank;
static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
static String[] ranks = {"narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

	public static Exercise2[] makeDeck() {
		//new array called deck of cards (Card is called Exercise 2 for the simplicity of ordering exercises)
		Exercise2[] deck = new Exercise2[52];
		
		//populating the array with objects
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				deck[index] = new Exercise2(suit, rank);
				index++;
			}
		}
		
		//returning the object
		return deck;
	}
	
	//constructor for the object
	public Exercise2 (int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public static void main(String[] args) {
		//printing the cards using the static arrays of strings and the fact that methods are replaced by the return values when invoked
		for (int i = 0; i < 52; i++) {
			System.out.println(ranks[makeDeck()[i].rank] + " of " + suits[makeDeck()[i].suit]);
		}
	}
}
