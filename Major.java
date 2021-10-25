package for_shapes;

public enum Major {
	COMPUTER_SCIENCE,
	MATH,
	ENGLISH,
	HISTORY,
	BIOLOGY,
	BUSINESS,
	PHYSICS,
	DESIGN,
	FOREIGN_LANGUAGE;
	
	public String toString() {
		return this.name().toLowerCase().replace('_', ' ');
	}
}
