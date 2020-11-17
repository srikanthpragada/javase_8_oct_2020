package streams;

import java.util.Arrays;
import java.util.function.Consumer;

class PrintName implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t.toUpperCase());
	}
}

public class ArrayToStream {

	public static void main(String[] args) {
		String[] names = { "TypeScript","Visual Basic","Java", 
				           "JavaScript", "Php", "Python","C#" };

		// Arrays.stream(names).forEach(new PrintName());
		
//		Arrays.stream(names)
//		      .forEach( v -> System.out.println(v.toUpperCase()));
		
		Arrays.stream(names)
		  .filter(v -> v.length() > 3)     // intermediate op
		  .sorted()                        // intermediate op 
		  .limit(3)                        // intermediate op 
	      .forEach(System.out::println);   // terminal op
	}

}
