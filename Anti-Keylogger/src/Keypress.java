import java.awt.AWTException;
import java.awt.Robot;

public class Keypress extends Thread{
	static int character = 0;
	static int wait = 0;
	
	public Keypress() {
	      // Create a new, second thread
	      super("Demo Thread");
	      System.out.println("Child thread: " + this);
	      start(); // Start the thread
	   }

	   // This is the entry point for the second thread.
	   public void run() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Child Thread: " + i);
				// Let the thread sleep for a while.
	            Thread.sleep(50);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Child interrupted.");
	      }
	      System.out.println("Exiting child thread.");
	   }

	public void start() {
		randomkeycode();
		waittime();
		type();
	}

	public static void randomkeycode() {
		if(randomnumber(0, 100) < 10) {
			character = randomnumber(48, 57);
		} else {
			character = randomnumber(65, 90);
		}
		
	}

	public static void waittime(){
		wait = randomnumber(1, 10);
	}
	
	public static int randomnumber(int low, int high) {
		double retvalD = Math.random() * high;
		while (retvalD < low) {
			retvalD = Math.random() * high;
		}
		int retvalI = (int)retvalD;
		return retvalI;
		//taken from exercise 3 of chapter 12 think java
	}
	
	public static void type() {
		try { 
			Robot robot = new Robot(); 
			robot.delay(wait); 
			robot.keyPress(character);

		} catch (AWTException e) { 
			e.printStackTrace(); 
		} 
	}
}
