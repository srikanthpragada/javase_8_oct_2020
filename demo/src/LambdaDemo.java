class Task implements Runnable {
	public void run() {
		System.out.println("Task");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Task());
		t1.start();

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Anonymous class");
			}
		});

		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("Lambda Expression"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});
		t4.start();

		// Method reference
		Thread t5 = new Thread(LambdaDemo::printNumbers);
		t5.start();

	}

	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

}
