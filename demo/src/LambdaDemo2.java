import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}

public class LambdaDemo2 {

	public static void main(String[] args) {
		var names = Arrays.asList(new String[] {"Java","JavaScript","Python","J#","C++","TypeScript"});
		
	    // Collections.sort(names, new LengthCompare());
		Comparator<String> compare =  (s1,s2) -> s1.length() - s2.length();
		System.out.println(compare.getClass());
		
		Collections.sort(names, (s1,s2) -> s1.length() - s2.length());
	    
	    for(String n : names)
	    	System.out.println(n);
	}

}
