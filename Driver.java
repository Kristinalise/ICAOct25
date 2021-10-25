package for_shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		
		Square s1 = new Square(1.2);
		Square s2 = new Square(1.5);
		Circle c1 = new Circle(3.2);
		Circle c2 = new Circle(3);
		RightTriangle rt1 = new RightTriangle(3, 4, 3, 5, 30, 60);
		
		List<Shape> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(c1);
		list.add(c2);
		list.add(rt1);
		
		
		Collections.sort(list);
		
		for(Shape s : list) {
			System.out.println(s + " area:");
			System.out.println(s.area());
		}
		
		
		
	}

}
