//Exercise 2

//	Step 1: Create a program called Date.java

public class Date {
	
	public static void main(String[] args) {
		
		//Step 2: Add a variables called day, date, month, year
		String day;
		int date;
		String month;
		int year;
		
		//Step 2: Set day to equal a day of the week, date a date in the month, etc.
		day = "Saturday";
		date = 16;
		month = "July";
		year = 2011;
		
		//Step 3: Print all the variables on a line by itself
		System.out.println(day);
		System.out.println(date);
		System.out.println(month);
		System.out.println(year);
		System.out.println("");
		
		//Step 4: Print the date in standard American form
		System.out.println("American Format:");
		System.out.print(day);
		System.out.print(", ");
		System.out.print(month);
		System.out.print(" ");
		System.out.print(date);
		System.out.print(", ");
		System.out.println(year);
		
		//Step 5: Print the date so the output is:
		
		//American format:
		//Saturday, July 16, 2011
		//European format:
		//Saturday 16 July, 2011
		
		System.out.println("European format:");
		System.out.print(day + " " + date + " " + month + ", " + year);

	}
}
