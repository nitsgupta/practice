package Node;

import java.util.HashMap;

public class TrieNode {
	private char value;
	private HashMap<Character, TrieNode> children;
	private boolean isEnd;

	public TrieNode(char ch) {
		value = ch;
		children = new HashMap<>();
		isEnd = false;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public HashMap<Character, TrieNode> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Character, TrieNode> children) {
		this.children = children;
	}

	public boolean isEnd() {
		return isEnd;
	}

	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}

	
	

}
