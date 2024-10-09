public interface Polygon extends ClosedCurve{
	
	default double[] getSides() {
		return null;
	}
	
	default double computePerimeter() {
		double perimeter =  0.0;
		double[]  sides  = getSides();
		for(double side:sides)
			perimeter+=side;
		return perimeter;
	}

}
