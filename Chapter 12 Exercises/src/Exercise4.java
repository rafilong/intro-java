/*
 * Chapter 12
 * Exercise 4
 * 
 * See code for explanation
 * 
 * Encapsulate the code in Section 12.10 in a method called makeHist that takes an array of scores
 * and returns a histogram of the values in the array. 
 */
public class Exercise4 {

	public static int[] makeHist(int[] scores) {
		//makes a new array to store count of values
		int[] counts = new int[100];
		
		//a loop that adds to count every time a certain value appears
		for (int i = 0; i < scores.length; i++) {
			int index = scores[i];
			counts[index]++;
		}
		
		return counts;
	}
	
	public static void main(String[] args) {
		//makes a new array of random ints
		int[] randomS = new int[200];
		for (int i = 0; i < randomS.length; i++) {
			randomS[i] = randomInt(0, 10);
		}
		
		//helping the viewer understand what is below
		System.out.println("Below is a histogram. It counts how many times a certain value appears. That is it.");
		System.out.println("");
		
		//printing out the axis name
		System.out.print("Count:    ");
		
		//prints the amount of a value
		for (int i = 0; i < 10; i++) {
			System.out.print(makeHist(randomS)[i] + "   ");
		}
		
		//printing out the axis name
		System.out.println("");
		System.out.print("Value:    ");
		
		//printing out what the value is so the view understands
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "    ");
		}
	}
	
	//makes random ints for the purpose of creating an array of random ints
	public static int randomInt(int low, int high) {
		double retvalD = Math.random() * high;
		while (retvalD < low) {
			retvalD = Math.random() *high;
		}
		int retvalI = (int)retvalD;
		return retvalI;
	}

}
