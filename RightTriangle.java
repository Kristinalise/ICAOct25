package for_shapes;

public class RightTriangle extends Triangle implements RightAngles {

	private double smallAngle;
	private double largeAngle;
	private double rightAngle;
	
	public RightTriangle(double theBase, double theHeight, double theSide1, double theSide2, double theSmallAngle, double theLargeAngle) {
		super(theBase, theHeight, theSide1, theSide2);
		smallAngle = theSmallAngle;
		largeAngle = theLargeAngle;
		rightAngle = 90;
	}

	@Override
	public int rightCorners() {
		return 1;
	}
	
}
