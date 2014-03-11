/*
 * OOP Exercise 1.4
 * Code written by Rafi Long
 * 
 * Documentation is in the code
 * Run the main() in TestMyCircle for console output
 */

public class TestMyCircle {
	
	public static void main(String args[]) {
		//making a center
		MyPoint center = new MyPoint(2, 2);
		
		//makes a new circle with the center object (MyPoint)
		MyCircle circle = new MyCircle(center, 10);
		
		/* Testing getters */
		System.out.println("Testing MyCircle getters");
		System.out.println();
		
		System.out.println("Testing getRadius: " + circle.getRadius()); //testing getRadius
		System.out.println("Testing getCenter: " + circle.getCenter()); //testing getCenter by automatically calling MyPoint.toString()
		System.out.println("Testing getCenterX: " + circle.getCenterX()); //testing getCenterX, which calls MyPoint.getX()
		System.out.println("Testing getCenterY: " + circle.getCenterY()); //testing getCenterY, which calls MyPoint.getY()
		System.out.println("Testing toString: " + circle); // testing toString by automatically calling it
		System.out.println("Testing getArea: " + circle.getArea()); //testing GetArea, which uses the formula for finding circle's area to return the area
		
		System.out.println();
		System.out.println();
		
		/* Testing setters */
		System.out.println("Testing MyCircle setters");
		System.out.println();
		
		System.out.println("Testing setRadius");
		System.out.println("Current radius: " + circle.getRadius()); //getting radius
		circle.setRadius(5); //changing the radius
		System.out.println("Changed radius: " + circle.getRadius()); //getting radius
		System.out.println();

		System.out.println("Testing setCenterXY");
		System.out.println("Current center: " + circle.getCenter()); //getting center
		circle.setCenterXY(5, 5); //changing the center with two ints
		System.out.println("Changed center: " + circle.getCenter()); //getting center
		System.out.println();
		
		System.out.println("Testing setCenter");
		System.out.println("Current center: " + circle.getCenter()); //getting center
		MyPoint muchCenter = new MyPoint(5, 5); //making anew point
		circle.setCenter(muchCenter); //changing the center with a new MyPoint object
		System.out.println("Changed center: " + circle.getCenter()); //getting center
		System.out.println();
	}
}
