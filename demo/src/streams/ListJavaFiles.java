package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ListJavaFiles {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("c:\\classroom\\oct8");
		
		Files.walk(p)
		     .filter(f -> f.toString().endsWith(".java"))
		     .filter(f -> f.toString().contains("List"))
		     .forEach(System.out::println);

	}
	
//	public static boolean isJavaFile(Path p) {
//		return p.toString().endsWith(".java");
//	}

}
