package assignment2;

public class Trie {
	class Node {
		public char c;
		public long f;
		public boolean isWord;
		public boolean isFrequency;
		public Node[] children;

		public Node(char c, long f) {
			this.c = c;
			this.f = f;
			isWord = false;
			isFrequency = false;
			children = new Node[26]; // stores every character of the alphabet
		}
	}

	private Node root;

	public Trie() {
		root = new Node('\0', 0); // root that stores a charcter and its frequency
	}

	public void insert(String line) {
		int pos = line.indexOf(","); // position of the comma in each line
		String word = line.substring(0, pos); // the word is from index 0 to the comma
		long count = Long.parseLong(line.substring(pos + 1)); // the frequency is everything else after comma
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {	// loop through the word 
			char c = word.charAt(i);	// set the character at index i as c
			if (curr.children[c - 'a'] == null) { // if null, create a new node
				curr.children[c - 'a'] = new Node(c, count);
			}
			curr = curr.children[c - 'a'];
		}
		curr.isWord = true;	// if the current node creates a word, set to true

	}

	public boolean search(String word) {	// search function to search for a word
		Node node = getNode(word);
		return node != null && node.isWord;
	}

	public boolean startsWith(String prefix) {	// startsWith function that gets the prefix of a word
		return getNode(prefix) != null;
	}

	private Node getNode(String word) {	// getNode function that  gets the word in the trie
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (curr.children[c - 'a'] == null) {
				return null;
			}
			curr = curr.children[c - 'a'];
		}
		return curr;
	}
}
