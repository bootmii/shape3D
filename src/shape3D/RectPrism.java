package shape3D;

public class RectPrism extends RightPrism implements Shape3D {
	private double length, width, height;
	
	public double getVolume() {
		// TODO Auto-generated method stub
		return length*width*height;
	}

	public double getSurfaceArea() {
		// TODO Auto-generated method stub
		return 2*((length*width)+(width*height)+(length*height));
	}

	public double getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	public double getBaseArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
