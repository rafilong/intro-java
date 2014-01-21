/* 
 * Chapter 11
 * Exercise 3
 * 
 *  Step 1  Create a new program called Rational.java that defines a class named Rational
 *  Step 2  A Rational object should have two integer instance variables to store the numerator and denominator.
 *  Step 3  Write a constructor that takes no arguments and that sets the numerator to 0 and denominator to 1.
 *  Step 4  Write a method called printRational that takes a Rational object as an argument and prints it in some
 *  		reasonable format.
 *  Step 5  Write a main method that creates a new object with type Rational, sets its instance variables to some values,
 *  		and prints the object.
 *  Step 6  Write a second constructor for your class that takes two arguments and that uses them to initalize the
 *  		instance variables.
 *  Step 7  Write a method called negate that reverses the sign of a rational number. This method should be a modifier,
 *  		so it should return void. Add lines to main to test the new method.
 *  Step 8  Write a method called invert that inverts the number by swapping the numerator and denominator. Add lines
 *  		to main to test the new method.
 *  Step 9  Write a method called toDouble that converts the rational number to a double (floating-point number) and
 *  		returns the result. This method is a pure function; it does not modify the object. As always, test the
 *  		new method.
 *  Step 10 Write a modifier named reduce that reduces a rational number to its lowest terms by finding the greatest
 *  		common divisor (GCD) of the numerator and denominator and dividing through. This method should be a pure
 *  		function; it should not modify the instance variables of the object on which it is invoked. To find the
 *  		GCD, see Exercise 10).
 *  Step 11 Write a method called add that takes two Rational numbers as arguments and returns a new Rational object.
 *  		The return object should contain the sum of the arguments.
 *  		There are several ways to add fractions. You can use any one you want, but you should make sure that the
 *  		result of the operation is reduced so that the numerator and denominator have no common divisor
 *  		(other than 1). 
 */

	//Step 1 Here we create a new class and create instance variable ints numerator and denominator
public class Rational { 
	//Step 2 
int numerator, denominator;

	//Step 5 Write a main method that creates a new object with type Rational, sets its instance
		//variables to some values, and prints the object
	public static void main(String[] args) {
		Rational test = new Rational(0, 0);
		Rational testAdd = new Rational(5, 7);
		
		reset(test);
		
		printRational(test);
		
		reset(test);
		
		//Step 7 Part 2  Add lines to main to test the new method
		negate(test);
		printRational(test);
		
		reset(test);
		
		//Step 8 Part 2  Add lines to main to test the new method
		invert(test);
		printRational(test);
		
		reset(test);
		
		//Step 9 Part 2  As always, test the new method.
		double doubleValue = toDouble(test);
		System.out.println(doubleValue);
		
		reset(test);
		
		reduce(test);
		
		printRational(add(test, testAdd));
	}

	//Step 3 Here is the constructor that takes no arguments
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;
	}
	
	//Step 6 Write a second constructor for your class that takes two arguments and that uses them to initialize the instance variables.
	public Rational(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}
	
	//!! a reset for the purpose of resetting the values after testing !!\\
	public static void reset(Rational test) {
		test.numerator = 10;
		test.denominator = 20;
	}
	
	//Step 4 Write a method called printRational  prints a Rational object
	public static void printRational(Rational tPrint) {
		System.out.println(tPrint.numerator +  "/"  + tPrint.denominator);
	}
	
	//Step 7  Write a method called negate that reverses the sign of a rational number. This method should be a modifier, so it should return void.
	public static void negate(Rational test) {
		test.numerator = test.numerator * -1;
		if(test.denominator <= 0) {
			test.numerator = test.numerator * -1;
			test.denominator = test.denominator * -1;
		}
	}
	
	//Step 8 Step 8  Write a method called invert that inverts the number by swapping the numerator and denominator
	public static void invert(Rational test) {
		int tempN = test.numerator;
		int tempD = test.denominator;
		
		test.numerator = tempD;
		test.denominator = tempN;
	}
	
	//Step 9  Write a method called toDouble that converts the rational number to a double (floating-point number) and returns the result. This method is a pure function; it does not modify the object. 
	public static double toDouble(Rational test) {
		double retval = (double)test.numerator / (double)test.denominator;
		return retval;
	}
	
	//Step 10 Step 10 Write a modifier named reduce that reduces a rational number to its lowest terms
	public static void reduce(Rational test) {
		int remain, num1, num2;
		num1 = test.numerator;
		num2 = test.denominator;
		remain = num1 % num2;
		while(remain != 0) {
			remain = num1 % num2 ;
			num1 = num2;
			num2 = remain;
		}
		int GCD = num1;
		
		Rational ret = new Rational(test.numerator/GCD, test.denominator/GCD);
		
		printRational(ret);
	}
	
	//Step 11  Write a method called add that takes two Rational numbers as arguments and returns a new Rational object. The return object should contain the sum of the arguments.
	public static Rational add(Rational test, Rational testAdd) {
		Rational retAdd = new Rational(0, 0);
		if(test.denominator == testAdd.denominator) {
			retAdd.numerator = test.numerator + testAdd.numerator;
			retAdd.denominator = test.denominator;
			return retAdd;
		} else {
			retAdd.numerator = test.numerator * testAdd.denominator;
			retAdd.denominator = test.denominator * testAdd.denominator;
			
			testAdd.numerator = testAdd.numerator * test.denominator;
			testAdd.denominator = testAdd.denominator * test.denominator;
			
			retAdd.numerator += testAdd.numerator;
			
			int remain, num1, num2;
			num1 = retAdd.numerator;
			num2 = retAdd.denominator;
			remain = num1 % num2;
			while(remain != 0) {
				remain = num1 % num2 ;
				num1 = num2;
				num2 = remain;
			}
			int GCD = num1;
			
			retAdd.numerator = retAdd.numerator/GCD;
			retAdd.denominator = retAdd.denominator/GCD;
			
			return retAdd;
		}
	}
}
