package shape3D;

public class Cylinder extends RightPrism implements Shape3D {
	private double height;
	private double radius;
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	public double getSurfaceArea() {
		return 2*Math.PI*radius*(height+radius);
	}
	public double getBaseArea() {
		return Math.PI*radius*radius;
	}
	public double getRadius() {return radius;}

}
