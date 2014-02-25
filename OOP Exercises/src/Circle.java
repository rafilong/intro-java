/*
 * Code by Rafi Long
 * 
 * You can not run the Circle class by itself because it does not include a main method. Without one Java does not know how to start
 * 
 * 3.
 * You can not access the instance values directly in TestCircle because they are set to be private variables. That means that they can only be accessed in the class in which they are declared. Changing them to public variables would fix this problem, or you could add getters and setters
 * 
 * 4.
 * Yes, there may be a need to change the values of radius and color of the Circle instance. For example, if this program was used to measure the area of a rubber band, someone could pull on it, increasing it's size
 * 
 */

public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      this.radius = 1.0;
      this.color = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }
   
   public Circle(double radius, String color) {
	   this.radius = radius;
	   this.color = color;
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return this.radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return this.radius*this.radius*Math.PI;
   }
   
   public String getColor() {
	   return this.color;
   }
   
	// Setter for instance variable radius
	public void setRadius(double r) {
		radius = r;
	}

	// Setter for instance variable color
	public void setColor(String c) { 
		
	}
	
	public String toString() {
		return "Circle: radius=" + radius + " color=" + color;
	}
}
