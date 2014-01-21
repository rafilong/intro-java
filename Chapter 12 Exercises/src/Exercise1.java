/*
 * Chapter 12
 * Exercise 1
 * See code
 * 
 * Step 1: Write a method called cloneArray that takes an array of integers as a parameter
 * 
 * Step 2: creates a new array that is the same size
 * 
 * Step 3: copies the elements from the first array into the new one,
 * 
 * Step 4: and then returns a reference to the new array. 
 */
public class Exercise1 {

	//Step 1 cloneArray takes an array of ints
	public static int[] cloneArray(int[] firstArray) {
		//Step 2 creates a new array that is the same size
		int[] secondArray = new int [firstArray.length];
		//Step 3 copies the elements from the first array into the new one
		for(int i = 0; i < firstArray.length; i++) {
			secondArray[i] = firstArray[i];
		}
		//Step 4 and then returns a reference to the new array
		return secondArray;
	}
	
	public static void main(String[] args) {
		int[] firstArray = {5, 6, 1, 2, 3};
		cloneArray(firstArray);
	}

}
