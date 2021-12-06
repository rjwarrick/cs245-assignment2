package assignment2;

public class Spelling {
	public List<List<String>> suggest(String token, int count) {
		// take in a token (word) and a count (count number of words with top
		// frequencies)
		// iterate through the characters using the insert fuction?
		// create a list of list of strings that stores the most frequently used words
		// starting from
		// the first letter, first and second, and so on until the whole word is
		// complete.
		// look at first character, look at possible substrings of character, look for
		// most frequent word in the subtree of that character

		// 1. Build trie
		// 2. method to read and store data to the root
		// 3. suggest function
		// -------------------------------------------------- //

		// List< > result ---> need to return, intilaize at beginning
		// List <String> suggestion;
		// List <Trie> prefix; search -> traverse ->; fill it reset every iteration
		// Trie.prefix/data
//			Trie t = root;
		List<List<String>> result = new ArrayList<List<String>>(); // result list that stores the all the lists of the
																	// words of top (count) frequencies
		List<String> suggestion = new ArrayList<String>(); // suggestion list that stores the words
		List<String> prefix = new ArrayList<Trie>(); // list that stores the prefix of the token

		Trie t = new Trie();

		for (int i = 0; i < token.length(); i++) {
			char ch = token.charAt(i);
			System.out.println(ch);

//			traverse(List<Trie> list,t.charlen());
			// sort(list) -> get top (count) number of frequencies)
			for (int j = 0; j < count; j++) {
//				 suggest.add(startsWith.(0).string); // using the prefix of the current iteration, retrive the top words with highest frequencies
				// this suggest will be our result
				// t = t.children([ch -'a']);

			}

		}
		return result;

		//
		// for ( < token> ) {
		// char ch = ... // ch = "h" first iteration
		// traverse (List <Trie> list, t.children)
		// root.children[ch - 'a'];
		// sort (List<Trie> list)
		// for ( i < count ) {
		// add.prefix.(0).string) to suggestions consider if list < count
		// suggest -> result
		// t = t.childrem([ch - 'a']) "h" -> "e"
	}
}
