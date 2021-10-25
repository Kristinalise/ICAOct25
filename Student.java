package for_shapes;

public class Student implements Comparable<Student>{

	private String firstName;
	private String lastName;
	private int year;
	private Major major;
	
	public Student(String first, String last, int theYear, Major theMaj) {
		firstName = first;
		lastName = last;
		year = theYear;
		major = theMaj;
	}
	
	public String getFirst() {
		return firstName;
	}
	
	public String getLast() {
		return lastName;
	}
	
	public int getYear() {
		return year;
	}
	
	public Major getMajor() {
		return major;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " is in year " + year + " and studies " + major+ "."; 
	}

	@Override
	public int compareTo(Student o) {
		if (lastName.compareTo(o.getLast()) == 0) {
			return firstName.compareTo(o.getFirst());
		}else {
			return lastName.compareTo(o.getLast());
		}
	}
	
	
	
	
}
