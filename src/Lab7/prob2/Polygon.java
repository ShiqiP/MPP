
public interface Polygon extends ClosedCurve{
	
	 double[] getSides(); 
	
	default double computePerimeter() {
		double perimeter =  0.0;
		double[]  sides  = getSides();
		for(double side:sides)
			perimeter+=side;
		return perimeter;
	}

}
