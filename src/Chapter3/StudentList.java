package Chapter3;

public class StudentList {

	public static void main(String[] args) {
		ListQueue list = new ListQueue();

		list.enqueue(new Student("Frank", 2.0));
		list.enqueue(new Student("Joe", 3.5));
		list.enqueue(new Student("Alex", 3.7));
		list.enqueue(new Student("Bob", 3.4));
		list.enqueue(new Student("Dale", 3.3));
		list.enqueue(new Student("Bartholomew", 4.9));
		list.enqueue(new Student("Robert", 3.9));
		list.enqueue(new Student("Calvin", 2.8));

		ListQueue honorsList = cutAtGPA(list, 3.5);

		while (!honorsList.isEmpty()) {
			Student temp = (Student) honorsList.dequeue();
			System.out.println(temp.getName() + " - " + temp.getGPA());
		}
		
	}

	public static ListQueue cutAtGPA(ListQueue students, double minGPA) {
		ListQueue honorsList = new ListQueue();

		while (!students.isEmpty()) {
			Student temp = (Student) students.dequeue();
			if (temp.getGPA() >= minGPA)
				honorsList.enqueue(temp);
		}

		return honorsList;
	}
}