package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringJoiner;

public class RemoveSpaces2 {

	public static void main(String[] args) throws IOException {

		Path file = Path.of("c:\\classroom\\oct8\\names.txt");
		Path target = Path.of("c:\\classroom\\oct8\\new_names.txt");

		String content = Files.readString(file);
		StringJoiner sj = new StringJoiner("\n"); // Separater is \n
		content.lines().forEach(v -> sj.add(v.strip()));

		Files.writeString(target, sj.toString());

	}

}
