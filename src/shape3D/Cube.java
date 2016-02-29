package shape3D;

public class Cube extends RectPrism implements Shape3D {
	public Cube(double length, double width, double height) {
		super(length, width, height);
		if(length == width && length == height) side = length;
		else throw new IllegalStateException("ERROR: Not a cube");
	}
	private double side;
	
	public double getSurfaceArea() { return 6*side*side; }
	public double getHeight() { return side; }
	public double getBaseArea() { return side*side; }
	public double getLength() { return side; }
	public double getWidth() { return side; }
}
