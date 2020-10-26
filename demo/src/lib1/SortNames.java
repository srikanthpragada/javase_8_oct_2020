package lib1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class SortNames {

	public static void main(String[] args) {

		String input = "Tom,Roberts,James,Garry,Larry,Tim";

		// sort names
		String names[] = input.split(",");
		Arrays.sort(names);
		for (String n : names)
			System.out.println(n);

	}

}
