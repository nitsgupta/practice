package trieNode;

public class InputNode {
	private int TOTAL_INPUTS = 10; // default 10

	private String[] inputs;

	public InputNode() {
		inputs = new String[TOTAL_INPUTS];
	}

	public void generateInput() {
		String e1 = "a>b=1";
		String e2 = "a>b=2";
		String e3 = "a>c>e=3";
		String e4 = "a>c>f=4";
		String e5 = "b>a=5";
		String e6 = "a>b>c=5";
		String e7 = "b=7";
		String e8 = "a>b>c>d=99";
		String e9 = "a>b=99";
		

		inputs[0] = e1;
		inputs[1] = e2;
		inputs[2] = e3;
		inputs[3] = e4;
		inputs[4] = e5;
		inputs[5] = e6;
		inputs[6]= e7; 
		inputs[7] = e8;
		inputs[8] = e9; 

	}

	public String[] getInputs() {
		return inputs;
	}

}
