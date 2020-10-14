
public class FunDemo {

	public static void wish(String name) {
		System.out.println("Hello, " + name);
	}

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	// Variable number of args 
	public static void greet(String ... names) {
		for(String n : names)
			System.out.println("Hello, " + n);
	}
	public static void main(String[] args) {
//		wish("James");
//		System.out.println(add(10, 20));
		
		greet("Larry","Steve","Bill");
		greet("Scott","Elon");
	}

}
