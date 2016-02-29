package shape3D;

public class Cube extends RectPrism implements Shape3D {
	private double side;
	public double getSurfaceArea() { return 6*side*side; }
	public double getHeight() { return side; }
	public double getBaseArea() { return side*side; }
	public double getLength() { return side; }
	public double getWidth() { return side; }
}
