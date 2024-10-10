package Lab7.prob2;

public class Rectangle implements Polygon {
	private double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
//	@Override
//	public double computePerimeter() {
//		double perimeter =  0.0;
//		double[]  sides  = getSides();
//		for(double side:sides)
//			perimeter+=side;
//			
//		return perimeter;
//	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double[] getSides() {
		return (new double[]{length, width,length, width});
	}
}
