package oop;

enum Course {
	JAVA, PYTHON, ORACLE
}

class Student {
	private int admno;
	private String name;
	private int feepaid;
	private Course course;

	// Static method
	public static int getTotalFee(Course course) {
		if (course == Course.PYTHON)
			return 10000;
		else if (course == Course.JAVA)
			return 15000;
		else
			return 8000;
	}

	public Student(int admno, String name, Course course) {
		this.admno = admno;
		this.name = name;
		this.course = course;
	}

	public Student(int admno, String name, Course course, int feepaid) {
		this(admno, name, course);
		this.feepaid = feepaid;
	}

	public void pay(int amount) {
		this.feepaid += amount;
	}

	public int getDue() {
		return Student.getTotalFee(this.course) - this.feepaid;
	}

	public void print() {
		System.out.println(this.admno);
		System.out.println(this.name);
		System.out.println(this.course);
		System.out.println(this.feepaid);
	}
}

public class TestStudent {
	public static void main(String[] args) {
		System.out.println(Student.getTotalFee(Course.JAVA));

		Student s = new Student(1, "Mark", Course.JAVA);
		s.print();
		Student s2 = new Student(2, "Scott", Course.PYTHON, 3000);
		s.pay(5000);
		s.pay(3000);
		System.out.println(s.getDue());
	}

}
