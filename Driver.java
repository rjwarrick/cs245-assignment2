package assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String arg[]) throws FileNotFoundException {
		try {
			Trie trie = new Trie();

			File file = new File("unigram_freq.csv");
//			File file = new File(arg[0]);	// when using count, do arg[1], it returns a string (ParseInt)
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String line;

			int iteration = 0;
			while ((line = br.readLine()) != null) {
				if (iteration == 0) { // skip first line of csv file "word,count"
					iteration++;
					continue;
				} else {
					trie.insert(line);	// inserts the line
					System.out.println(line);
				}

			}

//			Driver d = new Driver();
//			d.suggest("hello", 5);
//			System.out.println("Contents of File: ");
//			System.out.println(trie.toString());
//			System.out.println("the" + " " + trie.search("the"));
//			System.out.println("qqqq" + " " + trie.search("qqqq")); // "qqqq" is an actual word in the file
//			System.out.println("ahsdfkjawlrh" + " " + trie.search("ahsdfkjawlrh"));
//			System.out.println(trie.startsWith("t"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
