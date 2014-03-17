/*
 * OOP Exercise 1.6
 * Code written by Rafi Long
 * 
 * Documentation is in the code
 * Run main() in MyComplexTest to see testing
 * Run main() in MyComplexApp to see program
 */

public class MyComplexTest {

	public static void main(String args[]) {
		MyComplex complex = new MyComplex(2, 2);
		MyComplex another = new MyComplex(3, 3);
		
		/* Testing getters */
		System.out.println("Testing getters");
		System.out.println();
		
		System.out.println("Testing getReal: " + complex.getReal());
		System.out.println("Testing getImag: " + complex.getImag());
		System.out.println("Testing toString: " + complex);
		
		System.out.println();
		System.out.println();
		
		
		/* Testing setters */
		System.out.println("Testing setters");
		System.out.println();
		
		System.out.println("Testing setReal");
		System.out.println("Current real: " + complex.getReal());
		complex.setReal(5);
		System.out.println("Changed radius: " + complex.getReal()); 
		System.out.println();
		
		System.out.println("Testing setImag");
		System.out.println("Current real: " + complex.getImag()); 
		complex.setImag(5); 
		System.out.println("Changed radius: " + complex.getImag()); 
		System.out.println();

		System.out.println("Testing setValue");
		System.out.println("Current values: " + complex); 
		complex.setValue(6, 6); 
		System.out.println("Changed radius: " + complex); 
		System.out.println();

		System.out.println("Testing multiplyWith");
		System.out.println("Current values: " + complex); 
		complex.multiplyWith(another); 
		System.out.println("Changed radius: " + complex); 
		System.out.println();

		System.out.println("Testing divideBy");
		System.out.println("Current real: " + complex); 
		complex.divideBy(another); 
		System.out.println("Changed radius: " + complex); 
		
		System.out.println();
		System.out.println();

		
		/* Testing returns */
		System.out.println("Testing returns");
		System.out.println();
		
		System.out.println("Testing isReal: " + complex.isReal());
		System.out.println("Testing isImaginary: " + complex.isImaginary());
		System.out.println("Testing equals: " + complex.equals(another));
		System.out.println("Testing magnitude: " + complex.magnitude());
		System.out.println("Testing argumentInRadians: " + complex.argumentInRadians());
		System.out.println("Testing arguemntInDegrees: " + complex.argumentInDegrees());
	}
}
