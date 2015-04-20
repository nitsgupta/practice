package trieCore;

import java.util.HashMap;

import Node.TrieNode;
import trieInterface.ITrie;

public abstract class trieCore implements ITrie {

	@Override
	public void insert(String word, TrieNode root) {
		if (word == null || word.isEmpty() == true)
			return;

		// Find length of the given word
		int length = word.length();

		TrieNode crawl = root;

		// Traverse through all characters of given word
		for (int level = 0; level < length; level++) {
			HashMap<Character, TrieNode> child = crawl.getChildren();

			char ch = word.charAt(level);

			// If there is already a child for current character of given word
			if (child.containsKey(ch))
				crawl = child.get(ch);
			else {
				// Else create a child
				TrieNode temp = new TrieNode(ch);
				child.put(ch, temp);
				crawl = temp;
			}
		}

		// Set end true for last character
		crawl.setEnd(true);
	}

	@Override
	public void delete(String word, TrieNode root) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean search(String word, TrieNode root) {

		if (word == null || word.isEmpty() == true || root == null)
			return false;

		// Find length of the given word
		int length = word.length();

		TrieNode crawl = root;

		// Traverse through all characters of given word
		for (int level = 0; level < length; level++) {
			HashMap<Character, TrieNode> child = crawl.getChildren();

			char ch = word.charAt(level);

			// If there is already a child for current character of given word
			if (child.containsKey(ch))
				crawl = child.get(ch);
			else {
				return false;
			}

		}
		return (crawl != null && crawl.isEnd());

	}

}
