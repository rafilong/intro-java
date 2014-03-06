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
		
		/* Testing book getters */
		System.out.println("Testing book getters");
		System.out.println();
		
		System.out.println("Testing .getName(): " + book.getName());
		System.out.println("Testing .getAuthor(): " + book.getAuthor());
		System.out.println("Testing .getPrice(): " + book.getPrice());
		System.out.println("Testing .getQtyInStock(): " + book.getQtyInStock());
		System.out.println("Testing .getAuthorName(): " + book.getAuthorName());
		System.out.println("Testing .getAuthorEmail(): " + book.getAuthorEmail());
		System.out.println("Testing .getAuthorGender(): " + book.getAuthorGender());
		
		System.out.println();
		System.out.println();
		
		/* Testing book setters */
		System.out.println("Testing book setters");
		System.out.println();
		
		System.out.println("Testing .setPrice:");
		System.out.println("Current price: " + book.getPrice());
		book.setPrice(20);
		System.out.println("New price: " + book.getPrice());
		System.out.println();
		
		System.out.println("Testing .setQtyInStock:");
		System.out.println("Current quantity: " + book.getQtyInStock());
		book.setQtyInStock(9001);
		System.out.println("New quantity: " + book.getQtyInStock());
		System.out.println();
	}
}
