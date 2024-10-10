package Lab7.prob2;
public class Ellipse implements ClosedCurve {
	private double semiAxis;
	private double Elateral;
	
	public Ellipse(double semiAxis, double elateral) {

		this.semiAxis = semiAxis;
		Elateral = elateral;
	}

	@Override
	public double computePerimeter() {
		return 4*semiAxis*Elateral;
	}

}
