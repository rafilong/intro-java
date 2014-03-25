/*
 * OOP Exercise 1.7
 * Code written by Rafi Long
 * 
 * See code for documentation
 * Run main() in TestMyPolynomial for test cases
 * Expected return is next to the print statement
 * 
 * Setters and getters and implicitly invoked with add, multiply, getDegree, evaluate
 */

public class TestMyPolynomial {

	public static void main(String args[]) {
		MyPolynomial poly = new MyPolynomial(1, 2, 3); //
		MyPolynomial pola = new MyPolynomial("file.txt");
		
		/* Testing returns */
		System.out.println("Testing returns");
		System.out.println();
		System.out.println("Poly is " + poly);
		System.out.println("Pola is " + pola);
		
		System.out.println();
		System.out.println("Testing toString: " + poly); //expected return is 3.0x^2 + 2.0x + 1.0
		System.out.println("Testing add: " + poly.add(pola));  //expected return is 3.0x^2 + 4.0x + 2.0
		System.out.println("Testing multiply: " + poly.multiply(pola)); //expected return is 6.0x^3 + 7.0x^2 + 4.0x + 1.0
		System.out.println("Testing getDegree: " + poly.getDegree()); //expected return is 2
		System.out.println("Testing evaluate: " + poly.evaluate(1)); //expected return is 6.0
	}
}
