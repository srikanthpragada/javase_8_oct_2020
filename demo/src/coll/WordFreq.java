package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class WordFreq {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("c:\\classroom\\old_man.txt");
		String text = Files.readString(p);

		var words = text.split("\\W+");

		var wordfreq = new TreeMap<String, Integer>();

		for (String w : words) {
			if (wordfreq.containsKey(w)) {
				// word is found so increment count
				var count = wordfreq.get(w);
				wordfreq.put(w, count + 1);
			} else {
				// word is not found so put a new entry with value 1
				wordfreq.put(w, 1);
			}
		}
		
		for(String w : wordfreq.keySet())
			System.out.printf("%-15s  %3d\n", w, wordfreq.get(w));

	}

}
