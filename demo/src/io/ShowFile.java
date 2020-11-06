package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShowFile {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter filename :");
		String filename = s.nextLine(); 
		
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		int lineno = 1;
		while(true) {
			String line = br.readLine();
			if(line == null)
				break;
			System.out.printf("%3d:%s\n",lineno,line);
			lineno ++;
		}
		
        fr.close();
        br.close();
	}

}
