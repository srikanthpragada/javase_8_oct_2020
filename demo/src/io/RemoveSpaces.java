package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RemoveSpaces {

	public static void main(String[] args) throws IOException {
		Path file = Path.of("c:\\classroom\\oct8\\names.txt");
		Path target = Path.of("c:\\classroom\\oct8\\new_names.txt");

		String content = Files.readString(file);
		var bw = Files.newBufferedWriter(target);
		
		content.lines().forEach(v ->  {
			try {
				bw.write(v.strip() + "\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		bw.close(); 
		
		
		 

	}

}
