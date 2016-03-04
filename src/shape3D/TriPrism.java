package shape3D;

public class TriPrism extends RightPrism implements Shape3D {
	private double height;
	private double baseSideA;
	private double baseSideB;
	private double baseSideC; // support for scalene triangular prisms
	public TriPrism(double h, double a, double b, double c) {
		if(h<=0||a<=0||b<=0||c<=0)
			throw new IllegalStateException("Edge lengths must be positive");
		if(a>=b+c||b>=a+c||c>=a+b)
			throw new IllegalStateException("Base is not a triangle");
		height = h;
		baseSideA = a;
		baseSideB = b;
		baseSideC = c;
	}
	@Override
	public double getSurfaceArea() {
		return height*(baseSideA+baseSideB+baseSideC) + 2*getBaseArea();
	}

	@Override
	public double getBaseArea() {
		/**
		 * Returns the area of the triangle base using Heron's formula.
		 * WARNING: Returns unexpected results if base has a small angle.
		 */
		double s = (baseSideA+baseSideB+baseSideC)/2;	
		return Math.sqrt(s*(s-baseSideA)*(s-baseSideB)*(s-baseSideC));
	}
}
