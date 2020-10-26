package lib1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class ListNames {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		StringJoiner sj = new StringJoiner(",");

		while (true) {
			System.out.print("Enter a name [end to stop] :");
			String name = s.nextLine();
			if (name.equals("end"))
				break;
			sj.add(name);
		}

		System.out.println(sj);

		// sort names
		String names[] = sj.toString().split(",");
		Arrays.sort(names);
		for (String n : names)
			System.out.println(n);

	}

}
