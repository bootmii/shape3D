package shape3D;

public class Cone implements Shape3D {
	private double radius, height;
	public double getRadius() { return radius; }
	public double getHeight() { return height; }
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI*radius*radius*height/3;
	}

	public double getSurfaceArea() {
		return Math.PI*radius*(radius+Math.sqrt(height*height + radius*radius));
	}

}
