package lib1;

import java.util.Arrays;

public class Sort2D {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int sa [] = new int[25];

		for (int i = 0, p = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++, p ++) {
				a[i][j] = (int) Math.round(Math.random() * 100);
				System.out.printf("%5d", a[i][j]);
				sa[p] = a[i][j];
			}
			System.out.println();
		}

        Arrays.sort(sa); 
		

		for (int i = 0, p = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++, p ++) {
				a[i][j] = sa[p];
				System.out.printf("%5d", a[i][j]);
			}

			System.out.println();
		}

	}

}
