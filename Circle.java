package for_shapes;

public class Circle extends Shape {

	private double radius;
	private final double PI = 3.141592;
	
	
	public Circle(double theRadius) {
		radius = theRadius;
	}
	
	@Override
	public double area() {
		return PI * (radius * radius);
	}
	
	@Override
	public String toString() {
		return "Circle";
	}
	
}
