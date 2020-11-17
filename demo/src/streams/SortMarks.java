package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class SortMarks {

	public static void main(String[] args) throws Exception {

		Path p = Path.of("c:\\classroom\\oct8\\marks.txt");

		Files.lines(p)
		     .mapToInt(v -> Integer.parseInt(v))  // Covert to int
		     .filter(v -> v >= 50)                // select only values >= 50
		     .sorted()                            // sort 
		     .forEach(System.out::println);       // print
	}

}
