package shape3D;

public class Sphere implements Shape3D {
	private double radius;
	public double getRadius() { return radius; }
	public double getVolume() {
		return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}
	public double getSurfaceArea() {
		return 4*Math.PI*radius*radius;
	}
	public Sphere(double radius) {this.radius = radius;}
}
