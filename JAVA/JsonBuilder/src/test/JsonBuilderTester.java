package test;

import jsonBuilderImplementations.JsonBuilder;
import trieNode.InputNode;

public class JsonBuilderTester {

	public static void main(String[] args) {

		InputNode input = new InputNode();
		input.generateInput();

		String inputs[] = input.getInputs();
		JsonBuilder json = new JsonBuilder();

		for (String s : inputs) {
			try {
				json.insert(s);
			} catch (Exception e) {
				System.out
						.println("Unknown problem occurred " + e.getMessage());
				e.printStackTrace();
			}
		}

		try {
			String output = json.constructJSON();
			System.out.println(output);
		} catch (Exception e) {
			System.out.println("Unknown problem occurred " + e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Invalid inputs: "+json.getInvalidInputs().toString());
	}

}
