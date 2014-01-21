//Chapter 3

//Exercise 2

//	Step 1: What is the output of the following program?  Be precise about where there are space and where there are newlines
//		No, I wug.
//		You wugga wug.
//		I wug.
//
//			When "ping" gets called it enters a period and creates a newline
//			When "baffle" is called it prints "wug" and then calls "ping" so a period and a newline appear

//	Step 2: Draw a stack diagram that shows the state of the program the first time ping is invoked
//		main3[zoop2[baffle3[ping]]]


public class Exercise2 {

	public static void zoop() {
		baffle();
		System.out.print("You wugga ");
		baffle();
	}
	
	public static void main(String[] args) {
		System.out.print("No, I ");
		zoop();
		System.out.print("I ");
		baffle();
	}
	
	public static void baffle() {
		System.out.print("wug");
		ping();
	}
	
	public static void ping() {
		System.out.println(".");
	}

}