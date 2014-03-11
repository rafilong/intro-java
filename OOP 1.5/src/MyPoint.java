/*
 * See TestMyTriangle for reading
 */

public class MyPoint {
	//instances variables
	private int x; //x location
	private int y; //y location
	
	public MyPoint() {
		//sets instance variables to 0 when there are no arguments
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		//sets instance variables to the arguments
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		//returns the object in a good string form
		return ("(" + this.x + ", " + this.y + ")");
	}
	
	 public double distance(int x, int y) {
		 //returns the distance between the object and another point (with coordinates entered) with the following formula
		 //square root of change in x * change in y = distance
		 return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	 }
	 
	 public double distance(MyPoint another) {
		 //returns the distance between the object and another point (with an object) with the following formula
		 //square root of change in x * change in y = distance
		 return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
	 }
	
	public void setXY(int x, int y) {
		//sets both x and y
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		//returns x
		return this.x;
	}
	
	public void setX(int x) {
		//sets x
		this.x = x;
	}

	public int getY() {
		//returns y
		return this.y;
	}
	
	public void setY(int y) {
		//sets y
		this.y = y;
	}
}
