/*
 * OOP Exercise 1.7
 * Code written by Rafi Long
 * 
 * See code for documentation
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
		System.out.println("Added is " + poly.add(pola));
		System.out.println("Multi is " + poly.multiply(pola));
	}
}
