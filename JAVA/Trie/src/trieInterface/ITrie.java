package trieInterface;

import Node.TrieNode;

public interface ITrie {

	public void insert(String word, TrieNode root);
	public void delete(String word, TrieNode root);
	public boolean search(String word, TrieNode root);
	
}
