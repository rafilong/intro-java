
public class MyDate {
	private int year;
	private int month;
	private int day;
	public static String[] strMonths = 
		{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public static String[] strDays = 
		{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	public static int[] daysInMonths =
		{31, 28, 31, 30, 31, 31, 30, 31, 30, 31};	
	
	public MyDate(int year, int month, int day) {
		if (isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			throw new IllegalArgumentException("Invalid year, month, or day");
		}
	}
	
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidDate(int year, int month, int day) {
		boolean validYear = year >= 1 &&  year <= 9999;
		boolean validMonth = month >= 1 && month <= 1;
		boolean validDay = day >= 1 && day <= daysInMonths[month];
		
		if (validYear && validMonth && validDay) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int getDayOfWeek(int year, int month, int day) {
		// credit to Tyler for assisting - otherwise would be much more messy
		int[] monthTable = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5}; 
		if (isLeapYear(year)) {
			monthTable[0] = 6;
			monthTable[1] = 2;
		}
		
		int firstTwo = year / 100;
		int lastTwo = year % 100;
		
		return (lastTwo + 6 - firstTwo % 4 * 2 + lastTwo / 4 + day) % 7;
	}
	
	public void setDate(int year, int month, int day) {
		if (isValidDate(year, month, day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		} else {
			throw new IllegalArgumentException("Invalid year, month, or day");
		}
	}


	public int getYear() {
		return year;
	}


	public int getMonth() {
		return month;
	}


	public int getDay() {
		return day;
	}


	public void setYear(int year) {
		if (isValidDate(year, month, day)) {
			this.year = year;
		} else {
			throw new IllegalArgumentException("Invalid year");
		}
	}


	public void setMonth(int month) {
		if (isValidDate(year, month, day)) {
			this.month = month;
		} else {
			throw new IllegalArgumentException("Invalid month");
		}
	}


	public void setDay(int day) {
		if (isValidDate(year, month, day)) {
			this.day = day;
		} else {
			throw new IllegalArgumentException("Invalid day");
		}
	}
	
	public String toString() {
		String[] dayPrefix = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Sat"};
		return dayPrefix[getDayOfWeek(year, month, day)] + "day " + day + " " + month + " " + year;
	}
	
	public void nextDay() {
		 
	}
}
