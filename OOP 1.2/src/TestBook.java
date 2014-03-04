/*
 * For documentation look at the top of TestAuthor
 */

public class TestBook {

	//tests the class Book
	public static void main(String args[]) {
		//makes a new author for the use of making a book with the author
		Author anAuthor = new Author("Tyler Packard", "tp@tylerpackard.com", 'm');
		
		//makes a new book using the above author, using the constructor with all arguments
		Book aBook = new Book("'Javascript for Dummies'", anAuthor, 19.95, 1000);
		
		//prints all the information for aBook
		System.out.println("Author information for " + aBook.getName() + " is " + aBook.getAuthor().getName() + " " + aBook.getAuthor().getEmail());
		
		// Use an anonymous instance of Author
		Book anotherBook = new Book("'Java for Dumbs'", new Author("Nihar Mitra", "nm@niharmitra.com", 'm'), 29.95, 888);
		
		//prints the book anotherBook, but because there isn't a toString() method it just prints the instance of the object
		System.out.println(anotherBook);
	}
}
