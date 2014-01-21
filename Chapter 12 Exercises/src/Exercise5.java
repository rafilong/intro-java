/*
 * Chapter 12
 * Exercise 5
 * 
 * See code for explanation
 * 
 * Write a method named areFactors that takes an integer n and an array of integers,
 * and that returns true if the numbers in the array are all factors of n
 */
public class Exercise5 extends Exercise1 {

	//method named areFactors that takes int n and an array of integers
	public static boolean areFactors(int n, int[] array) {
		boolean retval = true;
		//if n is divisible by the number in the array, then nothing happens
		for (int i = 0; i < array.length; i++) {
			if (n % array[i] == 0) {
			//however, if n is not divisible by the number, than the retval is set to false
			} else {
				retval = false;
			}
		}
		//and the method returns retval
		return retval;
	}
	
	public static void main(String[] args) {
		//divisors being declared
		int[] divisors = new int[3];
		divisors[0] = 1;
		divisors[1] = 2;
		divisors[2] = 4;
		
		//invoking the method
		boolean answer = areFactors(64, divisors);
		
		//creating a nice output
		if (answer == true) {
			System.out.println("The number is divisible by the divisors");
		} else {
			System.out.println("The number is not divisible by the divisors");
		}
	}

}
