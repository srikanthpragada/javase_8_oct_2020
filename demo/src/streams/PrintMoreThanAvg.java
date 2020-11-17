package streams;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintMoreThanAvg {

	public static void main(String[] args) throws Exception {

		Path p = Path.of("c:\\classroom\\oct8\\marks.txt");

		var avgMarks = 
		   	  Files.lines(p)
		     .mapToInt(v -> Integer.parseInt(v))  // Covert to int
		     .average()       // OptionalDouble 
		     .getAsDouble();
		
		System.out.println(avgMarks);
		    
	}

}
