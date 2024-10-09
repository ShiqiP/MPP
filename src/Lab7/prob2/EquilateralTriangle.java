
public class EquilateralTriangle implements Polygon {
	private double side;
	
	public EquilateralTriangle(double side) {
		this.side = side;
	}

//	@Override
//	public double computePerimeter() {
//		double perimeter =  0.0;
//		double[]  sides  = getSides();
//		for(double side:sides)
//			perimeter+=side;
//		return perimeter;
//	}

	public double[] getSides() {
		return new double[] {side, side, side};
	}
}
