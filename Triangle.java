package for_shapes;

public abstract class Triangle extends Shape {
	
	private double base;
	private double height;
	private double side1;
	private double side2;
	
	public Triangle(double theBase, double theHeight, double theSide1, double theSide2) {
		base = theBase;
		height = theHeight;
		side1 = theSide1;
		side2 = theSide2;
	}
	
	public double area() {
		return (height * base) / 2;
	}
	
	@Override
	public String toString() {
		return "Triangle";
	}
}
