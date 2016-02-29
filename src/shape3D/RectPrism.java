package shape3D;

public class RectPrism extends RightPrism implements Shape3D {
	private double length, width, height;
	public RectPrism(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double getSurfaceArea() {
		return 2*((length*width)+(width*height)+(length*height));
	}
	public double getBaseArea() {
		return length*width;
	}
	public double getLength() {return length;}
	public double getWidth() {return width;}

}
