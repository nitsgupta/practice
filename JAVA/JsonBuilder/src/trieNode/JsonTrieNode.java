package trieNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JsonTrieNode {

	private Character value;
	private HashMap<Character, JsonTrieNode> children;
	private List<String> expressionValue;
	private boolean isEnd;

	public JsonTrieNode(Character value) {
		this.value = value;
		this.children = new HashMap<>();
		this.expressionValue = new ArrayList<String>();
		isEnd = false;
	}

	public Character getValue() {
		return value;
	}

	public void setValue(Character value) {
		this.value = value;
	}

	public HashMap<Character, JsonTrieNode> getChildren() {
		return children;
	}

	public void setChildren(HashMap<Character, JsonTrieNode> children) {
		this.children = children;
	}

	public List<String> getExpressionValue() {
		return expressionValue;
	}

	public void setExpressionValue(List<String> expressionValue) {
		this.expressionValue = expressionValue;
	}

	public boolean isEnd() {
		return isEnd;
	}

	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}

}
