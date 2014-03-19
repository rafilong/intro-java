/*
 * OOP Exercise 1.6
 * Code written by Rafi Long
 * 
 * Documentation is in the code
 * Run main() in MyComplexTest to see testing
 *   Expected returns are in comments near the print statement
 * Run main() in MyComplexApp to see program
 * Description of methods are below, and all methods are in MyComplex
 * Testing is organized in getters, setters, and returns, and are found below in the main() method
 */

/*
 * Sorry I didn't get this done on time
 * Instead of focusing on copy-pasting the code, I tried to understand complex numbers in depth
 * Because it is late, I include an explanation of what I learned, below
 * 
 * 
 * Complex Numbers:
 * 
 * Complex numbers are a pair of a real and imaginary number
 * 	This pair can make some math problems much simpler
 * Imaginary numbers are a real number multiplied by root -1
 * 	This is imaginary because it is impossible to have a square root of -1
 * 
 * Complex numbers can be notated as a real and imaginary number, but also as a point on a coordinate plane
 * In this plane, the real number would be on one axis, and the imaginary on the other
 * The point where these numbers line up would be the imaginary number
 * This can be noted by the magnitude, which is the distance between the point and the origin (0,0)
 * 	The magnitude can be calculated with the distance formula, or Pythagorean Theorem
 * However, with the magnitude the complex number could be anywhere on the circle formed with the origin as the center and the magnitude as the radius
 * This is why we need to use the argument
 * The argument is the degree in which the line of magnitude forms with the x-axis
 * This can be found simply by using a tangent, and can be converted from degrees to radians
 * 
 * Complex numbers can be added, subtracted, multiplied, and divided
 * In addition an subtraction, the operator goes between the real and the real, and the imaginary and the imaginary
 * 	For example (3, 4) + (5, 3) = (3 + 5, 4 + 3)
 * In multiplication and division, you multiply the numbers as though they were binomials, and when simplified they form a real and imaginary number (calculated with the root -1)
 */

public class MyComplexTest {

	public static void main(String args[]) {
		MyComplex complex = new MyComplex(2, 2);
		MyComplex another = new MyComplex(3, 3);
		
		/* Testing getters */
		System.out.println("Testing getters");
		System.out.println();
		
		System.out.println("Testing getReal: " + complex.getReal()); //calls getReal | return is 2
		System.out.println("Testing getImag: " + complex.getImag()); //calls getImag | return is 2
		System.out.println("Testing toString: " + complex); //implicitly calls toString | return is (2, 2)
		
		System.out.println();
		System.out.println();
		
		
		/* Testing setters */
		System.out.println("Testing setters");
		System.out.println();
		
		System.out.println("Testing setReal");
		System.out.println("Current real: " + complex.getReal()); //finds number with getReal | return is 2
		complex.setReal(5); //changes the real with setReal
		System.out.println("Changed radius: " + complex.getReal());  //finds number with getReal | return is 5
		System.out.println();
		
		System.out.println("Testing setImag");
		System.out.println("Current real: " + complex.getImag()); //finds number with getImag | return is 2
		complex.setImag(5); //changes the imaginary with setImag
		System.out.println("Changed radius: " + complex.getImag()); //finds number with getImag | return is 5
		System.out.println();

		System.out.println("Testing setValue");
		System.out.println("Current values: " + complex); //finds number by implicitly calling toString | return is (5, 5)
		complex.setValue(6, 6); //changes the values with setValue
		System.out.println("Changed radius: " + complex); //finds number by implicitly calling toString | return is (6, 6)
		System.out.println();

		System.out.println("Testing add");
		System.out.println("Current values: " + complex); //finds number by implicitly calling toString | return is (6, 6)
		MyComple added = complex.add(another); //adds the complex number by `another` with multiplyWith
		System.out.println("Changed values: " + added); //finds number by implicitly calling toString | return is (9, 9)
		System.out.println();

		System.out.println("Testing subtract");
		System.out.println("Current real: " + complex); //finds number by implicitly calling toString | return is (6, 6)
		MyComplex subtracted = complex.subtract(another); //subtracts the complex number by `another` with divideBy
		System.out.println("Changed values: " + subtracted); //finds number by implicitly calling toString | return is (3, 3)
		System.out.println();
		
		System.out.println("Testing multiplyWith");
		System.out.println("Current values: " + complex); //finds number by implicitly calling toString | return is (6, 6)
		complex.multiplyWith(another); //multiplies the complex number by `another` with multiplyWith
		System.out.println("Changed values: " + complex); //finds number by implicitly calling toString | return is (0, 18)
		System.out.println();

		System.out.println("Testing divideBy");
		System.out.println("Current real: " + complex); //finds number by implicitly calling toString | return is (0, 18)
		complex.divideBy(another); //divides the complex number by `another` with divideBy
		System.out.println("Changed values: " + complex); //finds number by implicitly calling toString | return is (315, 34.5)
		
		System.out.println();
		System.out.println();

		
		/* Testing returns */
		System.out.println("Testing returns");
		System.out.println();
		
		System.out.println("Testing isReal: " + complex.isReal()); //calls isReal | return is false
		System.out.println("Testing isImaginary: " + complex.isImaginary()); //calls isImaginary | return is true
		System.out.println("Testing equals: " + complex.equals(another)); //calls equals | return is false
		System.out.println("Testing magnitude: " + complex.magnitude()); //calls magnitude | return is 316.88365372798893
		System.out.println("Testing argumentInRadians: " + complex.argumentInRadians()); //calls argumentInRadians | return is 0.10908900499998157
		System.out.println("Testing arguemntInDegrees: " + complex.argumentInDegrees()); //calls argumentInDegrees | return is 6
	}
}
