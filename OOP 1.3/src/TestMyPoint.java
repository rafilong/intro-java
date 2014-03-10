/*
 * MyPoint coded by Rafi Long
 * Documentation of the code is in the code
 * 
 * Run main in TestMyPoint for testing
 */

public class TestMyPoint {
 
	public static void main(String args[]) {
		//makes a new point using 2 arguments
		MyPoint point = new MyPoint(2, 2);
		
		/* Testing MyPoint getters */
		System.out.println("Testing MyPoint getters");
		System.out.println();
		
		System.out.println("Testing .toString: " + point); //tests toString()
		System.out.println("Testing .getX: " + point.getX()); //tests getX
		System.out.println("Testing .getY: " + point.getY()); //tests getY
		System.out.println("Testing .distance (between 2, 2 and 3, 3): " + point.distance(3, 3)); //tests distance
		
		System.out.println();
		System.out.println();
		
		
		/*Testing MyPoint setters */
		System.out.println("Testing myPoint setters");
		System.out.println();
		
		System.out.println("Current XY: " + point); //tests setXY
		point.setXY(3, 3);
		System.out.println("Changed XY: " + point);

		System.out.println("Current X: " + point.getX()); //tests setX
		point.setX(4);
		System.out.println("Changed X: " + point.getX());

		System.out.println("Current Y: " + point.getY()); //tests setY
		point.setY(4);
		System.out.println("Changed Y: " + point.getY());
	}
}
