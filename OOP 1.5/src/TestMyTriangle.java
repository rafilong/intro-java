/*
 * OOP Exercise 1.5
 * Code written by Rafi Long
 * 
 * See code for documentation
 * Run TestMyCircle.main() for console print
 * 
 * Easter Egg - convert points to characters with Dec codes to find the hidden message
 */

public class TestMyTriangle {

	public static void main(String args[]) {
		/* Creating new triangles */
		//making a new MyTriangle with 6 int arguments
		MyTriangle triangle = new MyTriangle(118, 32, 99, 111, 111, 108);
		
		//making a new MyTriangle with 3 MyPoints
		MyPoint v1 = new MyPoint(118, 32);
		MyPoint v2 = new MyPoint(99, 111);
		MyPoint v3 = new MyPoint(111, 108);
		MyTriangle vTriangle = new MyTriangle(v1, v2, v3);
		
		/* Testing getters */
		System.out.println("Testing getters for MyTriangle");
		System.out.println();
		
		System.out.println("Testing toString: " + triangle); //calls toString automatically for triangle
		System.out.println("Testing getPerimeter: " + vTriangle.getPerimeter()); //calls getPerimeter() for vTriangle
		System.out.println("Testing getType: " + triangle.getType()); //gets the type of triangle by calling getType
	}
}
