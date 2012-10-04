package Chapter1;

public class RightTriangle extends Triangle{

	public RightTriangle(double side) {
		super(side);
	}

	@Override
	public double getPerimeter() {
		return (2 + Math.sqrt(2.0)) * side;
	}

	@Override
	public double getArea() {
		return side * side / 2;
	}

}
