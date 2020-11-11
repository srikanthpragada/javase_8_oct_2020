package coll;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortNamesFromFile {

	public static void main(String[] args) throws IOException {
		try (FileReader fr = new FileReader("c:\\classroom\\oct8\\names.txt")) {
			var br  = new BufferedReader(fr);
			var names = new ArrayList<String>();
						
			while(true) {
				String name = br.readLine();
				if (name == null)
					break;
				
				names.add(name);
			}
			br.close();
			
			Collections.sort(names);
			
			for(String name : names)
				System.out.println(name.toUpperCase());

		}
	}

}
