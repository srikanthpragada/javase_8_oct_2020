package io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadNames {

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("c:\\classroom\\oct8\\names.txt")) {
			int ch;

			while (true) {
				ch = fr.read();
				if (ch == -1) // EOF
					break;
				System.out.print((char) ch);
			}

		}
	}

}
