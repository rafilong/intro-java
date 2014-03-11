/*
 * See TestMyPoint for reading
 */

public class MyTriangle {
	//instance of points for my triangle
	MyPoint v1 = new MyPoint();
	MyPoint v2 = new MyPoint();
	MyPoint v3 = new MyPoint();
	
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		//sets the points using MyPoint.setXY
		this.v1.setXY(x1, y1); 
		this.v2.setXY(x2, y2);
		this.v3.setXY(x3, y3);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		//sets the points using another MyPoint
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String toString() {
		//returns a String with all the info, automatically calling MyPoint.toString()
		return "Triangle @ (" + v1 + "), " + v2 + "), " + v3 + ")";
	}
	
	public double getPerimeter() {
		//returns an int that is the distance between all of the points
		return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
	}
	
	public String getType() {
		//finds whether the triangle is equilateral, isoceles, or scalene by comparing the distance between points
		if (v1.distance(v2) == v2.distance(v3) &&  v2.distance(v3) == v3.distance(v1) && v3.distance(v1) == v1.distance(v2)) {
			return "equilateral";
		} else if (v1.distance(v2) == v2.distance(v3) ||  v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v2)) {
			return "isosceles";
		} else {
			return "scalene";
		}
	}
}
