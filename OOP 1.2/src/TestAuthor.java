/*
 * OOP Exercises 1.2
 * Code written by Rafi Long
 * Documentation of the code is found in the code
 * The other main method is found in TestBook.java
 */

public class TestAuthor {

	//tests the class Author
	public static void main(String args[]) {
		//makes a new author object
		Author anAuthor = new Author("Tyler Packard", "tpk@tylerpackard.com", 'm');
		
		//prints the author, calling toString automatically
		System.out.println(anAuthor);   // call toString()
		
		//changes the email of the author
		anAuthor.setEmail("tp@tylerpackard.com");
		
		//prints the author again, including the new change
		System.out.println(anAuthor);
	}
}
