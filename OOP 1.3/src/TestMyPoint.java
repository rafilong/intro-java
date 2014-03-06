/*
 * MyPoint coded by Rafi Long
 */

public class TestMyPoint {
 
	public static void main(String args[]) {
		MyPoint point = new MyPoint(2, 2);
		
		/* Testing MyPoint getters */
		System.out.println("Testing MyPoint getters");
		System.out.println();
		
		System.out.println("Testing .toString" + point);
		System.out.println("Testing .getX: " + point.getX());
		System.out.println("Testing .getY: " + point.getY());
		System.out.println("Testing .distance (between 2, 2 and 3, 3): " + point.distance(3, 3));
		
		System.out.println();
		System.out.println();
		
		/*Testing MyPoint setters */
		System.out.println("Testing myPoint setters");
		System.out.println();
		
		System.out.println("Current XY: " + point);
		point.setXY(3, 3);
		System.out.println("Changed XY: " + point);

		System.out.println("Current X: " + point.getX());
		point.setX(4);
		System.out.println("Changed X: " + point.getX());

		System.out.println("Current Y: " + point.getY());
		point.setY(4);
		System.out.println("Changed Y: " + point.getY());
	}
}
