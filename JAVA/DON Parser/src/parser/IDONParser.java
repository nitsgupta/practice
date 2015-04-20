package parser;

import java.util.Map;

public interface IDONParser {

	
	
	public Map<String,Boolean> parseInputDONString(final String inputString);
	public String getModelString (Object object);
	public boolean validateObjectType(final String inputString, final Object object);
	public boolean checkObjectType(Map<String,Boolean> m, String [] s);
}
