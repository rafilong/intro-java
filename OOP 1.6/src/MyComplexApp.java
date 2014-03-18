import java.util.Scanner;

/*
 * See MyComplexTest for reading
 * This class prompts the user for complex numbers and then does operations on them
 */

public class MyComplexApp {

	public static void main(String args[]) {
		System.out.print("Enter complex number 1 (real and imaginary part): ");
		MyComplex complex = newComplex();
		System.out.println();
		
		System.out.print("Enter complex number 2 (real and imaginary part): ");
		MyComplex another = newComplex();
		System.out.println();
		
		System.out.println();
		
		System.out.print("Number 1 is: " + complex);
		System.out.println(complex + " is " +)
	}
	
	public static String textEnter() {
		//goes through all the steps to get a string from the scanner
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}
	
	public static double[] interperet(String text) {		
		int wordstart = 0;
		double[] complex = new double[2];
		for (int i = 0; i <= text.length(); i++) {
			if (i == text.length()) {
				complex[1] = Double.parseDouble(text.substring(wordstart, i));
			} else if (text.substring(i, i+1).equals(" ")) {
				complex[0] = Double.parseDouble(text.substring(wordstart, i));
				wordstart = i+1;
			}
		}
		return complex;
	}
	
	public static MyComplex newComplex() {
		String scanned = textEnter();
		MyComplex complex = new MyComplex(0, 0);
		complex.setValue(interperet(scanned)[0], interperet(scanned)[1]);
		return complex;
	}
}
