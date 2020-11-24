package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConvertUpper {

	public static void main(String[] args) throws IOException {
		Path file = Path.of("c:\\classroom\\oct8\\names.txt");

		String content = Files.readString(file);
		Files.writeString(file, content.toUpperCase());

	}

}
