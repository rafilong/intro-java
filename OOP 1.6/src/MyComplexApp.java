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
		
		System.out.println(complex + " is" + trueFalse[equal] + "equal to " + another); //uses equal and trueFalse to print whether the numbers are equal or not
		System.out.println(complex + " + " + another + " = " + added); //prints the variables added (complex and another) and added
		System.out.println(complex + " - " + another + " = " + subtracted); //prints the variabls subtracted (complex and another) and subtracted
	}
	
	public static String textEnter() {
		//goes through all the steps to get a string from the scanner
		Scanner sc = new Scanner(System.in); //makes a new scanner
		String text = sc.nextLine(); //makes the variable text equal the scanner when there is a new line
		return text; //returns text
	}
	
	public static double[] interperet(String text) {
		//breaks a String with multiple numbers into ints
		try { //makes a try catch that will catch if the String entered has characters
			int wordstart = 0; //a variable holding the start of the world
			double[] complex = new double[2]; //a variable for holding the ints
			for (int i = 0; i <= text.length(); i++) { //a for loop that repeats until the end of the String
				if (i == text.length()) { //an if statement, where if the for loop has made it to the end of the String it activates
					complex[1] = Double.parseDouble(text.substring(wordstart, i)); //adds a new number to the array between wordstart and the current space
				} else if (text.substring(i, i+1).equals(" ")) { //an if statement that activates if there is a space
					complex[0] = Double.parseDouble(text.substring(wordstart, i)); //adds the number between the last word and the current space
					wordstart = i+1; //resets wordstart
				}
			}
			return complex; //returns the array
		} catch (NumberFormatException e) { //catches if the String entered has characters
			System.out.println("Not valid type, please start over"); //asks the user to start over
			System.exit(0); //exits the program
		}
		return null; //a return that will never get activated, but is included to avoid errors
	}
	
	public static MyComplex newComplex() {
		//makes a new MyComplex
		String scanned = textEnter(); //makes the string equal to a text enter
		MyComplex complex = new MyComplex(0, 0); //makes a new MyComplex
		complex.setValue(interperet(scanned)[0], interperet(scanned)[1]); //sets the value of MyComplex to equal the values entered using interperet()
		return complex; //returns the complex number
	}
}
