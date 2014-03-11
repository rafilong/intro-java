/*
 * See TestMyCircle for reading
 */

public class MyCircle {
	//instance variables
	private MyPoint center = new MyPoint();
	private int radius;
	
	public MyCircle(int x, int y, int radius) {
		//sets center using the MyPoint setXY
		center.setXY(x, y);
		//sets the radius with the setter setRadius
		setRadius(radius);
	}
	
	public MyCircle(MyPoint center, int radius) {
		//sets the center using this. = 
		this.center = center;
		//sets the radius using this. =
		this.radius = radius;
	}
	
	public int getRadius() {
		//returns the radius
		return this.radius;
	}
	
	public void setRadius(int radius) {
		//sets the radius with an int in the argument
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		//returns the center
		return center;
	}
	
	public void setCenter(MyPoint center) {
		//changes the center with a new object
		this.center = center;
	}
	
	public int getCenterX() {
		//returns the X of center by using .getX from the MyPoint class
		return this.center.getX();
	}
	
	public int getCenterY() {
		//returns the Y of center by using .getY from the MyPoint class
		return this.center.getY();
	}
	
	public void setCenterXY(int x, int y) {
		//sets the X and Y of center with two ints
		this.center.setXY(x, y);
	}
	
	public String toString() {
		//converts the object into a string, with the help of the MyPoint toString method
		return "Circle @ " + this.getCenter() + " radius=" + this.radius;
	}
	
	public double getArea() {
		//gets the area with the pi radius^2 formula
		return Math.PI * Math.pow(radius, 2);
	}
}
