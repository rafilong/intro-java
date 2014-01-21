
public class Output {
	
	public static void printinterperet(String text) {
		int wordstart = 0;
		for (int i = 0; i <= text.length(); i++) {
			if (i == text.length()) {
				print(text.substring(wordstart, i));
			} else if (text.substring(i, i+1).equals(" ")) {
				print(text.substring(wordstart, i));
				wordstart = i+1;
				space();
			}
		}
	}

	static void print(String word) {
		System.out.print(word);
	}
	
	static void space() {
		System.out.print(" ");
	}
	
	public static void newline() {
		System.out.println("");
	}
	
	public static void newline(int lines) {
		for (int i = 0; i <= lines; i++){
			newline();
		}
	}
}