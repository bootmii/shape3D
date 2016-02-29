package shape3D;

public abstract class RightPrism {
	private double height;
	public double getVolume() {return height*this.getBaseArea();}
	public abstract double getSurfaceArea();
	public double getHeight() {return height;}
	public abstract double getBaseArea();
}
