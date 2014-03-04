/*
 * For documentation look at the top of TestAuthor
 */

public class Author {
	private String name; //the author's name
	private String email; //the author's email
	private char gender; //the author's gender
	
	public Author(String name, String email, char gender) {
		this.name = name; //setting the name to equal the argument "name"
		this.email = email; //setting the email to equal the argument "email"
		this.gender = gender; //setting the gender to equal the argument "gender"
	}
	
	//converts an author object into readable form
	public String toString() {
		return (this.name + " (" + this.gender + ") at " + this.email);
	}
	
	//returns the author's name
	public String getName() {
		return this.name;
	}
	
	//returns the author's email
	public String getEmail() {
		return this.email;
	}
	
	//changes the author's email according to the argument "email"
	public void setEmail(String email) {
		this.email = email;
	}
	
	//returns the author's gender
	public char getGender() {
		return this.gender;
	}
}
