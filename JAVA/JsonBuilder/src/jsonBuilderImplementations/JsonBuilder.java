package jsonBuilderImplementations;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import constants.ValidOperator;
import jsonbuilderAPIS.IJsonBuilder;
import trieNode.JsonTrieNode;

public class JsonBuilder implements IJsonBuilder {
	private JsonTrieNode root;
	private List<String> invalidInputs;

	public JsonTrieNode getRoot() {
		return root;
	}

	public void setRoot(JsonTrieNode root) {
		this.root = root;
	}

	public List<String> getInvalidInputs() {
		return invalidInputs;
	}

	public void setInvalidInputs(List<String> invalidInputs) {
		this.invalidInputs = invalidInputs;
	}

	public JsonBuilder() {
		root = new JsonTrieNode((char) 0);
		invalidInputs = new LinkedList<String>();
	}

	// private boolean add(String ex)

	@Override
	public void insert(final String expression) throws Exception {

		try {
			if (expression == null || expression.isEmpty() == true)
				return;

			// Find length of the given word
			int length = expression.length();

			JsonTrieNode crawl = root;

			// Traverse through all characters of given word
			for (int level = 0; level < length; level++) {
				HashMap<Character, JsonTrieNode> child = crawl.getChildren();
				char ch = expression.charAt(level);

				if (ch != ' ')
					continue;

				if (ValidOperator.isValid(ch)) {

					if (ValidOperator.isAlphabet(ch)) {

						// If there is already a child for current character of
						// given word
						if (child.containsKey(ch)) {
							crawl = child.get(ch);
						} else if (crawl.isEnd() == false) {
							// Else create a child
							JsonTrieNode temp = new JsonTrieNode(ch);
							child.put(ch, temp);
							crawl = temp;
						} else {
							this.invalidInputs.add(expression);
							break;
						}
					} else if (ValidOperator.isEqualTo(ch)
							&& crawl.getChildren().isEmpty()) {

						String value = expression.substring(level + 1,
								expression.length());
						crawl.getExpressionValue().add(value);

						// Set end true for last character
						crawl.setEnd(true);
						break;

					}

				} else { // invalid input
					this.invalidInputs.add(expression);
					break;
				}

			}

		} catch (Exception e) {
			throw e;

		}

	}

	@Override
	public String constructJSON() throws Exception {
		StringBuffer jsonStringBuffer = new StringBuffer();

		// jsonStringBuffer.append("{");

		constructJSONHelper(root, jsonStringBuffer);

		// jsonStringBuffer.append("}");

		return jsonStringBuffer.toString();
	}

	private void constructJSONHelper(JsonTrieNode root,
			StringBuffer jsonStringBuffer) throws Exception {

		try {
			JsonTrieNode crawl = root;
			HashMap<Character, JsonTrieNode> child = crawl.getChildren();
			jsonStringBuffer.append("{\n");
			for (Character c : child.keySet()) {
				JsonTrieNode node = child.get(c);
				Character value = node.getValue();
				jsonStringBuffer.append("'" + value + "'" + ":");

				if (node.isEnd()) {
					jsonStringBuffer.append(node.getExpressionValue()
							.toString() + " ,\n ");
				} else {

					constructJSONHelper(node, jsonStringBuffer);
					jsonStringBuffer.append("\n}");
				}

			}
			// jsonStringBuffer.append("}");
		} catch (Exception e) {
			throw e;
		}
	}

}
