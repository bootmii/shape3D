package shape3D;

import java.util.Arrays;
import java.util.Collections;

import javax.swing.event.ListSelectionEvent;

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
		// TODO Auto-generated method stub
		// return h*a + h*b + h*c + 2*getBaseArea();
		return 0;
	}

	@Override
	public double getBaseArea() {
		// TODO Auto-generated method stub
		double[] sides = {baseSideA, baseSideB, baseSideC};
		;
		return 0;
	}
}
