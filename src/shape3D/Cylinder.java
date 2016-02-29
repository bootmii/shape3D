package shape3D;

public class Cylinder extends RightPrism {
	private double height;
	private double radius;
	
	public double getSurfaceArea() {
		return 2*Math.PI*radius*(height+radius);
	}
	public double getBaseArea() {
		return Math.PI*radius*radius;
	}
	public double getRadius() {return radius;}

}
