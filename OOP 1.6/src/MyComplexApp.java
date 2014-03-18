import java.util.Scanner;

/*
 * See MyComplexTest for reading
 * This class prompts the user for complex numbers and then does operations on them
 */

public class MyComplexApp {

	public static String textEnter() {
		//goes through all the steps to get a string from the scanner
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}
	
	public void interperet(String text) {		
		int wordstart = 0;
		for (int i = 0; i <= text.length(); i++) {
			if (i == text.length()) {
				translate(text.substring(wordstart, i));
			} else if (text.substring(i, i+1).equals(" ")) {
				MyComplex.this.setReal(text.substring(wordstart, i));
				wordstart = i+1;
			}
		}
	}
	
	public static MyComplex newComplex() {
		MyComplex complex = new MyComplex(0, 0);
		complex.interperet
	}
}
