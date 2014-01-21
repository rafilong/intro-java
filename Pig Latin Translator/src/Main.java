import java.util.Scanner;


public class Main {
	static boolean repeat = true;
	
	public static void main(String args[]) {
		while (repeat) {
			Translate.interperet(start());
			repeat();
			Translate.newline(50);
		}
	}
	
	static String start() {
		Translate.print("Enter what you want to be scanned");
		Translate.newline();
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		return text;
	}
	
	static void repeat() {
		Translate.newline();
		System.out.println("Do you want to translate again? (yes/no)");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		if (text.equals("yes")) {
			
		} else if (text.equals("no")) {
			repeat = false;
		} else {
			System.out.println("Please enter 'yes' or 'no'");
			repeat();
		}
	}
}
