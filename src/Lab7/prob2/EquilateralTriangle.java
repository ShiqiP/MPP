
public class EquilateralTriangle implements Polygon {
	private double side;
	
	public EquilateralTriangle(double side) {
		this.side = side;
	}

	@Override
	public double computePerimeter() {
		
		return 3*side;
	}

	public double[] getSides() {
		return new double[] {side, side, side};
	}
}
