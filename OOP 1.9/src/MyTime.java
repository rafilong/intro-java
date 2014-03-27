
public class MyTime {
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public String toString() {
		String retval = "";
		
		if (this.hour > 10) {
			retval += hour;
		} else {
			retval += "0" + hour;
		}
		retval += ":";
		if (this.minute > 10) {
			retval += minute;
		} else {
			retval += "0" + minute;
		}
		retval += ":";
		if (this.second > 10) {
			retval += second;
		} else {
			retval += "0" + second;
		}
		
		return retval;
	}
	
	public MyTime nextSecond() {
		if (this.second < 59) {
			this.second++;
		} else {
			this.second = 0;
			this.nextMinute();
		}
		return this;
	}
	
	public MyTime nextMinute() {
		if (this.minute < 59) {
			this.minute++;
		} else {
			this.minute = 0;
			this.nextHour();
		}
		return this;
	}
	
	public MyTime nextHour() {
		if (this.hour < 23) {
			this.hour++;
		} else {
			this.hour = 0;
		}
		return this;
	}
	
	public MyTime previousSecond() {
		if (this.second > 0) {
			this.second--;
		} else {
			this.second = 59;
			this.previousMinute();
		}
		return this;
	}
	
	public MyTime previousMinute() {
		if (this.minute > 0) {
			this.minute--;
		} else {
			this.minute = 59;
			this.previousHour();
		}
		return this;
	}

	public MyTime previousHour() {
		if (this.hour > 0) {
			this.hour--;
		} else {
			this.hour = 23;
		}
		return this;
	}
}
