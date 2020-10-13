import java.util.Scanner;

// Take a number and display its factors 

public class Factors {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); // Associate scanner with keyboard

		System.out.print("Enter a number :");
		int num = s.nextInt(); // read an int from keyboard

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
