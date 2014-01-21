
public class Translate {
	
	public static void interperet(String text) {		
		int wordstart = 0;
		for (int i = 0; i <= text.length(); i++) {
			if (i == text.length()) {
				translate(text.substring(wordstart, i));
			} else if (text.substring(i, i+1).equals(" ")) {
				translate(text.substring(wordstart, i));
				wordstart = i+1;
			}
		}
	}
	
	static void translate(String original) {
		String translated;
		String first = original.substring(0, 1);
		
		if (first == first.toUpperCase()) {
			original = original.toLowerCase();
			translated = original.substring(1, 2).toUpperCase() + original.substring(2, original.length()) + original.substring(0, 1) + "ay";
		} else {
			original = original.toLowerCase();
			translated = original.substring(1, 2) + original.substring(2, original.length()) + original.substring(0, 1) + "ay";
		}
		print(translated);
	}
	
	static void print(String text) {
		System.out.print(text + " ");
	}
	
	static void newline() {
		System.out.println("");
	}
	
	static void newline(int n) {
		for (int i = 0; i < n; i++) {
			newline();
		}
	}
}
