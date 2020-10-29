package oop;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
	
}

public class SortStringByLength {

	public static void main(String[] args) {
		 String names [] = {"Java","Ada","C","C#","SQL","Python","TypeScript","JavaScript"};
		 
		 // Arrays.sort(names, new LengthCompare() );
		 
//		 Arrays.sort(names, 
//				 new Comparator<String>() {
//			         public int compare(String s1, String s2) {
//           					return s1.length() - s2.length();
//			     	}
//		         }
//		 );
		 
		 
		 Arrays.sort(names, (s1,s2) -> s1.length() - s2.length()); // Lambda Expression 
		 
		 for(String n : names)
			 System.out.println(n);
	}

}
