/*
 * Chapter 12
 * Exercise 2
 * 
 * Step 1 Write a method called randomDouble that takes two doubles, low and high,
 * Step 2 and that returns a random double x so that low ≤ x < high. 
 */

public class Exercise2 {

	//Step 1 Write a method called randomDouble that takes two double, low and high
	public static double randomDouble(int low, int high) {
		//Step 2 Part 1 - this makes the number with max high
		double retval = Math.random() * high;
		//Step 2 Part 2 - this ensures that the number is greater than low by rewriting all numbers less than it
		while (retval < low) {
			retval = Math.random() * high;
		}
		//Step 2 Part 3 - this returns retval!
		return retval;
	}
	
	public static void main(String[] args) {
		int low, high;
		low = 10;
		high = 100;
		for(int i = 0; i < 1000000; i++) {
			double random = randomDouble(low, high);
			System.out.println(random);
		}
	}
}
