/*
 * See TestMyCircle for reading
 */

public class MyCircle {
	//instance variables
	private MyPoint center = new MyPoint();
	private int radius;
	
	public MyCircle(int x, int y, int radius) {
		center.setXY(x, y);
		setRadius(radius);
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX() {
		return this.center.getX();
	}
	
	public int getCenterY() {
		return this.center.getY();
	}
	
	public void setCenterXY(int x, int y) {
		this.center.setXY(x, y);
	}
	
	public String toString() {
		return "Circle @ " + this.getCenter() + " radius=" + this.radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
