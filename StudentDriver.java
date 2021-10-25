package for_shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		Student julia = new Student("Julia", "Nolgo", 3, Major.DESIGN);
		Student jim = new Student("Jim", "Whittmer", 2, Major.HISTORY);
		Student jane = new Student("Jane", "Mortimer", 4, Major.FOREIGN_LANGUAGE);
		Student john = new Student("John", "Frances", 1, Major.COMPUTER_SCIENCE);

		List<Student> arr = new ArrayList<>();
		arr.add(julia);
		arr.add(jim);
		arr.add(jane);
		arr.add(john);
		
		Collections.sort(arr);
		
		for(Student s : arr) {
			System.out.println(s);
		}
		
	}

}
