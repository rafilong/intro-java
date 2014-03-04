/*
 * For documentation look at the top of TestAuthor
 */

public class TestBook {

	//tests the class Book
	public static void main(String args[]) {
		//makes a new author for the use of making a book with the author
		Author anAuthor = new Author("Nihar Mitra", "nm@niharmitra.com", 'm');
		//makes a new book using the above author, using the constructor with all arguments
		Book book = new Book("'Javascript for Dummies'", anAuthor, 19.95, 1000);
		
		/* Testing Book getters */
		System.out.println("Testing .getName(): " + book.getName());
		
		
		
	}
}
