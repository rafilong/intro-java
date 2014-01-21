/* Chapter 11
 * Exercise 1
 * 
 * Question 1
 * Write a definition for a class named Tile that represents Scrabble tiles. The instance variables should be a character named letter and an integer named value.
 * See line 22
 * 
 * Question 2
 * Write a constructor that takes parameters named letter and value and initializes the instance variables.
 * See line 31
 * 
 * Question 3
 * Write a method named printTile that takes a Tile object as a parameter and prints the instance variables in a reader-friendly format.
 * See line 37
 * 
 * Question 4
 * Write a method named testTile that creates a Tile object with the letter Z and the value 10, and then uses printTile to print the state of the object.
 * See line 42
 */

public class Tile {
	//Line 22 Creates instance variables letter and value with type char and int respectively
	char letter;
	int value;

	//Line 26 Main invokes the method testTile
	public static void main(String[] args) {
		testTile();
	}

	//Line 31 Constructor Tile initializes the instance of instance variables letter and value
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	//Line 37 Prints in the format asked for in the exercise
	public static void printTile(Tile tPrint) {
		System.out.println("The tile " + tPrint.letter + " has the score of " + tPrint.value);
	}
	
	//Makes a new instance of the object and sets the values of instance variables, then invokes printTile
	public static void testTile() {
		Tile test = new Tile('z', 10);
		printTile(test);
	}
}
