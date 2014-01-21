//Exercise 3

//Step 1: create a program called Time.java

public class Time {

	public static void main(String[] args) {
		//Step 2: Add new variables named hour, minute, second
		float hour;
		float minute;
		float second;
		
		//Step 2: Set the variable's values to the current time
		hour = 11;
		minute = 22;
		second = 23;
		
		//Step 3: Make the program calculate how much time has passed in seconds from midnight
		System.out.println("Seconds since midnight:");
		System.out.println(3600*hour + 60*minute + second);
		
		System.out.println();
		
		//Step 4: Make the program calculate how much time in seconds is left in the day
		System.out.println("Seconds left in day:");
		System.out.print(86400 - 3600*hour - 60*minute - second);
			//86400 is the # of seconds in a day
		System.out.println(" seconds");
		
		System.out.println();
		
		//Step 5: Make the program calculate what percentage of the day has passed
		System.out.println("Percentage of day left:");
		System.out.print((3600*hour + 60*minute + second)*100/86400);
		System.out.print(" %");
	}
}
