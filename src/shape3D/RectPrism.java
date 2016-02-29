package shape3D;

public class RectPrism extends RightPrism implements Shape3D {
	private double length, width, height;

	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		return 2*((length*width)+(width*height)+(length*height));
	}

	public double getBaseArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
