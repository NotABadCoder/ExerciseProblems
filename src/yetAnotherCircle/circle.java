package yetAnotherCircle;

public class circle {
		private double radius;
	   private String color;
	   
	   // Constructors (overloaded)
	   /** Constructs a Circle instance with default value for radius and color */
	   public circle() {  // 1st (default) constructor
	      radius = 1.0;
	      color = "red";
	   }
	   
	   /** Constructs a Circle instance with the given radius and default color */
	   public circle(double r) {  // 2nd constructor
	      radius = r;
	      color = "red";
	   }
	   
	   /** Returns the radius */
	   public double getRadius() {
	     return radius; 
	   }
	   
	   /** Returns the area of this Circle instance */
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   
	   public double getCircumference() {
		      return 2*radius*Math.PI;
		   }
	   public void setRadius(double newRadius) {
		   radius = newRadius;
		}
	   public String toString() {
		   return "Circle[radius=" + radius + " color=" + color + "]";
		}
}
