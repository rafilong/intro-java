/*
 * OOP Exercise 1.9
 * Code written by Rafi Long
 * 
 * See code for documentation
 * Run main() in TestMyTime for console output and test cases
 * See main() for test cases
 * Read below for method calls
 */

/* 
 * Documentation is in format:
 * [method]
 * [declaration] (in MyTime)
 * [test case, expected return] (in TestMyTime)
 * 
 * MyTime
 * 11
 * 82, 85 (implicit)
 * 
 * setTime
 * 18
 * 98
 * 
 * getHour
 * 25
 * 85 (implicit)
 * 
 * getMinute
 * 30
 * 85 (implicit)
 * 
 * getSecond
 * 35
 * 85 (implicit)
 * 
 * setHour
 * 40
 * 93 (implicit)
 * 
 * setMinute
 * 45
 * 93 (implicit)
 * 
 * setSecond
 * 50
 * 93 (implicit)
 * 
 * toString
 * 55
 * 85
 * 
 * nextSecond
 * 79
 * 87
 * 
 * nextMinute
 * 89
 * 87 (implicit)
 * 
 * nextHour
 * 99
 * 87 (implicit)
 * 
 * previousSecond
 * 108
 * 93
 * 
 * previousMinute
 * 119
 * 93 (implicit)
 * 
 * previousHour
 * 128
 * 93 (implicit)
 */

public class TestMyTime {

	public static void main(String args[]) {
		//makes a new time variable
		MyTime time = new MyTime(23, 59, 59);
		
		/* Next and Previous */
		System.out.println("Testing next..., implicitly setters and getters - current time is: " + time); //prints the time
		time.nextSecond(); //increases the second by one, implicitly testing setters and getters
		System.out.println("Increased time by one second is: " + time); //prints the changed time
		
		System.out.println();
		
		System.out.println("Testing previous..., implicitly setters and getters - current time is: " + time); //prints the time
		time.previousSecond(); //increases the second by one, implicitly testing setters and getters
		System.out.println("Decreased time by one second is: " + time); //prints the changed time
		
		System.out.println();
		
		/* Testing setter (all) */
		System.out.println("Testing setTime() - current time is: " + time);
		time.setTime(2, 40, 0);
		System.out.println("Changed time: " + time);
	}
}
