import java.util.Scanner;

/*
 * See MyComplexTest for reading
 * This class prompts the user for complex numbers and then does operations on them
 */

public class MyComplexApp {
	public static String[] trueFalse = {" NOT ", " "}; //an array of strings containing strings used for whether it is true or false (0 false, 1 true)
	
	public static void main(String args[]) {
		//finding variable stuff
		System.out.print("Enter complex number 1 (real and imaginary part): ");
		MyComplex complex = newComplex(); //calls the newComplex class, which opens a scanner and gets user input
		int complexReal = complex.isReal() ? 1:0; //finds whether the complex is real, and converts it to an int for the use of using the variable trueFalse
		int complexImag = complex.isImaginary() ? 1:0; //finds whether the complex is imaginary, and converts it to an int for the use of using the variable trueFalse
		
		System.out.print("Enter complex number 2 (real and imaginary part): ");
		MyComplex another = newComplex(); //calls the newComplex class, which opens a scanner and gets user input
		int anotherReal = another.isReal() ? 1:0; //finds whether the complex is real, and converts it to an int for the use of using the variable trueFalse
		int anotherImag = another.isImaginary() ? 1:0; //finds whether the complex is imaginary, and converts it to an int for the use of using the variable trueFalse
		
		System.out.println();
		
		//about the numbers (individually)
		System.out.println("Number 1 is: " + complex); //implicitly calls toString
		System.out.println(complex + " is" + trueFalse[complexReal] + "a pure real number"); //prints whether it is real or not (using trueFalse)
		System.out.println(complex + " is" + trueFalse[complexImag] + "a pure imaginary number"); //prints whether it is imaginary or not (using trueFalse)
		System.out.println();
		
		System.out.println("Number 2 is: " + another); //implicitly calls toString
		System.out.println(another + " is" + trueFalse[anotherReal] + "a pure real number"); //prints whether it is real or not (using trueFalse)
		System.out.println(another + " is" + trueFalse[anotherImag] + "a pure imaginary number"); //prints whether it is imaginary or not (using trueFalse)
		System.out.println();
		
		//about the numbers (combined)
		int equal = complex.equals(another) ? 1:0; //calls the equals method, and finds whether complex is equal to another or not (converting to a int for use of using the trueFalse variable)
		MyComplex added = complex.add(another); //finds what the value of the added variables equal
		MyComplex subtracted = complex.subtract(another); //finds what the value of the subtracted variables equal
		
		System.out.println(complex + " is" + trueFalse[equal] + "equal to " + another);
		System.out.println(complex + " + " + another + " = " + added);
		System.out.println(complex + " - " + another + " = " + subtracted);
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
