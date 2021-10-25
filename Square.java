package for_shapes;

public class Square extends Shape implements RightAngles {
	
	private double side;
	
	public Square(double theSide) {
		side = theSide;
	}
	
	@Override
	public double area() {
		return side * side;
	}
	
	@Override
	public String toString() {
		return "Square";
	}

	@Override
	public int rightCorners() {
		return 4;
	}

}
