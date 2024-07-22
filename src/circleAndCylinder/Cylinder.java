package circleAndCylinder;

public class Cylinder {
	private Circle base;
	private double height;
	public Cylinder() {
		base=new Circle();
		height=1.0;
	}
	// Constructor with default radius, color but given height
	   public Cylinder(double height) {
		   base=new Circle();
	      this.height = height;
	   }
	   // Constructor with default color, but given radius, height
	   public Cylinder(double radius, double height) {
		   base=new Circle();
	      base.setRadius(radius);  // call superclass constructor Circle(r)
	      this.height = height;
	   }
	   
	   // A public method for retrieving the height
	   public double getHeight() {
	      return height; 
	   }
	  
	   // A public method for computing the volume of cylinder
	   //  use superclass method getArea() to get the base area
	   public double getVolume() {
	      return base.getArea()*height; 
	   }
	   public Circle getCircle() {
		      return base;
	   }
}
