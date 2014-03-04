/*
 * For documentation look at the top of TestAuthor
 */

public class Book {
	private String name; //the name of the book
	private Author author; //the author information (uses the author constructor in Author)
	private double price; //the price of the book
	private int qtyInStock; //lists the quantity in stock
	
	//a constructor for a book without the qtyInStock variable - not the variable can still be changed later
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	//a constructor for the book with all of the variables
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	//returns the book's name
	public String getName() {
		return this.name;
	}
	
	//returns the book's author object - when this is printed it calls toString()
	public Author getAuthor() {
		return this.author;
	}
	
	//returns the book's price
	public double getPrice() {
		return this.price;
	}
	
	//changes the book's price to the argument 'price' 
	public void setPrice(double price) {
		this.price = price;
	}
	
	//returns the book's quantity in stock (qtyInStock)
	public int getQtyInStock() {
		return this.qtyInStock;
	}
	
	//changes the qtyInStock to the argument qtyInStock
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	//returns the book's author's name
	public String getAuthorName() {
		return this.getAuthor().getName();
	}
	
	//returns the book's author's email
	public String getAuthorEmail() {
		return this.getAuthor().getEmail();
	}
	
	//returns the book's author's gender
	public char getAuthorGender() {
		return this.getAuthor().getGender();
	}
}
