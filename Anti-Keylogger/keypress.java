import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class keypress {
	static int character = 0;
	static int wait = 0;

	public static void main(String[] args) { 		
		while(true) {
			randomkeycode();
			waittime();
			type();
		}
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
