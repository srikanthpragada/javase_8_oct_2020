package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		Object obj;
		
		 obj = "Abc";
		 System.out.println(obj.getClass());
		 obj = 10;  // AutoBoxing 
		 System.out.println(obj.getClass());
		 
		 Integer iobj = 100;

	}

}
