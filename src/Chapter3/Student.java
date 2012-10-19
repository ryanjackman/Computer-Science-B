package Chapter3;

public class Student {

	private String name;
	private double GPA;

	public Student(String n, double g) {
		name = n;
		GPA = g;
	}

	public String getName() {
		return name;
	}

	public double getGPA() {
		return GPA;
	}
}