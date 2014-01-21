//Chapter 4
//Exercise 3

//Step 1: Print the "99 Bottles of Beer" song

public class Exercise3 {

	//Creates a new variable and assigns it bottles - number of bottles on the wall
	public static void bottlesOfBeer(int bottles) {
		//Creates a new variable for the amount of bottles after one has been drunk
		int drinkBottles = bottles - 1;
		//If there are still bottles on the wall, then this will be executed
		if (bottles > 0) {
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer, ya' take one down, ya' pass it around, " + drinkBottles + " bottles of beer on the wall.");
		//If there aren't bottles on the wall this will be executed
		} else {
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
			//This return stops it from repeating and ends the method
			return;
		}
		bottles = drinkBottles;
		bottlesOfBeer(bottles);
	}
//This calls bottlesOfBeer and sets the value to 99
	public static void main(String[] args) {
		bottlesOfBeer(99);
	}
}
