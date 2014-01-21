/*
 * Chapter 12
 * Exercise 3
 * 
 * Step 1 Write a method called randomInt that takes two doubles, low and high,
 * Step 2 and that returns a random integer x so that low ≤ x < high. 
 */

public class Exercise3 {

	//Step 1 Write a method called randomDouble that takes two double, low and high
	public static int randomInt(int low, int high) {
		//Step 2 Part 1 - this makes the number with max high
		double retvalD = Math.random() * high;
		//Step 2 Part 2 - this ensures that the number is greater than low by rewriting all numbers less than it
		while (retvalD < low) {
			retvalD = Math.random() *high;
		}
		//Step 2 Part 3 - this converts the double to an int
		int retvalI = (int)retvalD;
		//Step 2 Part 4 - this returns the int
		return retvalI;
	}
	
	public static void main(String[] args) {
		int low, high;
		low = 10;
		high = 100;
		for(int i = 0; i < 1000000; i++) {
			int random = randomInt(low, high);
			System.out.println(random);
		}
	}
}
