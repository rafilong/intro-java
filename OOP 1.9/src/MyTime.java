/*
 * See TestMyTime for reading
 */

public class MyTime {
	//instance variables
	private int hour = 0; //variable for the hour
	private int minute = 0; //variable for the minute
	private int second = 0; //variable for the second
	
	public MyTime(int hour, int minute, int second) {
		//a constructor that sets the time with three arguments
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		//a setter that changes hour, minute, and second with three arguments
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		//a getter for hour
		return hour;
	}

	public int getMinute() {
		//a getter for minute
		return minute;
	}

	public int getSecond() {
		//a getter for second
		return second;
	}
	
	public void setHour(int hour) {
		//a setter for hour with one argument
		this.hour = hour;
	}

	public void setMinute(int minute) {
		//a setter for minute with one argument
		this.minute = minute;
	}

	public void setSecond(int second) {
		//a setter for second with one argument
		this.second = second;
	}
	
	public String toString() {
		String retval = ""; //makes a new value to return
		
		if (this.getHour() > 10) { //adds the hour, but adds a zero if it is one digit
			retval += hour;
		} else {
			retval += "0" + hour;
		}
		retval += ":";
		if (this.getMinute() > 10) { //adds the minute, but adds a zero if it is one digit
			retval += minute;
		} else {
			retval += "0" + minute;
		}
		retval += ":";
		if (this.getSecond() > 10) { //adds the second, but adds a zero if it is one digit
			retval += second;
		} else {
			retval += "0" + second;
		}
		
		return retval;
	}
	
	public MyTime nextSecond() {
		if (this.second < 59) { //increases a second, except when it will turn the next minute
			this.second++;
		} else { //if the second has turned to a minute, it sets the second to zero and increases the minute
			this.second = 0;
			this.nextMinute();
		}
		return this; //returns the time
	}
	
	public MyTime nextMinute() {
		if (this.minute < 59) { //increases a minute, except when it will turn the next hour
			this.minute++;
		} else { //if the minute has turned to a hour, it sets the minute to zero and increases the hour
			this.minute = 0;
			this.nextHour();
		}
		return this; //returns the time
	}
	
	public MyTime nextHour() {
		if (this.hour < 23) { //increases a hour, except when it will turn the next day
			this.hour++;
		} else { //if the hour has turned to a day, it sets the hour to zero
			this.hour = 0;
		}
		return this; //returns the time
	}
	
	public MyTime previousSecond() {
		if (this.second > 0) { //moves back a second, except when the second is zero
			this.second--;
		} else { //if the second is zero, sets the second to 59, and moves back a minute
			this.setSecond(59);
			this.previousMinute();
		}
		return this; //returns the time
	}
	
	public MyTime previousMinute() {
		if (this.minute > 0) { //moves back a minute, except when the minute is zero
			this.minute--;
		} else { //if the minute is zero, sets the minute to 59, and moves back an hour
			this.setMinute(59);
			this.previousHour();
		}
		return this; //returns the time
	}

	public MyTime previousHour() {
		if (this.hour > 0) { //moves back an hour, except when the hour is zero
			this.hour--;
		} else { //if the hour is zero, sets the hour to 23
			this.setHour(23);
		}
		return this; //returns the time
	}
}
