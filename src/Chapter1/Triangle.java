package Chapter1;

public abstract class Triangle {

	public double side;

	public Triangle(double side) {
		this.side = side;
	}

	public abstract double getPerimeter();


	public abstract double getArea();


	public double getRatio() {
		return getArea() / getPerimeter();
	}

}
