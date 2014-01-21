/*
 * Chapter 11
 * Exercise 2
 * 
 * Write a:
 * class definition for Date
 * an object type that contains three integers, year, month and day
 * This class should provide two constructors
 * The first should take no parameters
 * The second should take parameters named year, month and day, and use them to initialize the instance variables
 * Write a main method that creates a new Date object named birthday. The new object should contain your birthdate. You can use either constructor. 
 */

public class Date{
	//Here is the declaration for the instance variables for Date and the object type
	int year, month, day;
	
	public static void main(String[] args) {
		//Creates a new object named birthday
		Date birthday = new Date(1999, 05, 07);
		System.out.println(birthday.month + "-" + birthday.day + "-" + birthday.year);
	}
	
	//One constructor that takes no parameters
	public Date() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}
	
	//Two constructor that takes parameters year, month, and day
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

}
