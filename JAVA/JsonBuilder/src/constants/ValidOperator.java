package constants;

public class ValidOperator {

	public static final char GREATER_THAN = '>';
	public static final char EQUAL_TO = '=';
	public static final char A = 'a';
	public static final char B = 'b';
	public static final char C = 'c';
	public static final char D = 'd';
	public static final char E = 'e';
	public static final char F = 'f';

	public static boolean isValid(char ch) {
		if (ch == GREATER_THAN || ch == A || ch == B || ch == C || ch == D
				|| ch == E || ch == F || ch == EQUAL_TO)
			return true;
		return false;
	}

	public static boolean isAlphabet(char ch) {
		if (ch == GREATER_THAN || ch == EQUAL_TO)
			return false;
		return true;
	}

	public static boolean isGreatertThan(char ch) {
		if (ch == GREATER_THAN)
			return true;
		return false;

	}
	
	public static boolean isEqualTo(char ch) {
		if (ch == EQUAL_TO)
			return true;
		return false;

	}
}
