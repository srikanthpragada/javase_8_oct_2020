package io;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class ShowFile2 {

	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter filename :");
//		String filename = s.nextLine();
		
		String filename = "c:\\classroom\\oct8\\numbers.java";

		FileReader fr = new FileReader(filename);
		LineNumberReader lnr = new LineNumberReader(fr);

		while (true) {
			String line = lnr.readLine();
			if (line == null)
				break;
			System.out.printf("%3d:%s\n", lnr.getLineNumber(), line);
		}

		fr.close();
		lnr.close();
	}

}
