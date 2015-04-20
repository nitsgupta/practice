package parsers;

import java.util.HashMap;
import java.util.Map;

import model.Employee;
import parser.IDONParser;

public class EmployeeParser implements IDONParser {

	private static final String DON_SEPRATOR = ",";

	@Override
	public boolean validateObjectType(final String inputString,
			final Object employee) {
		try {
			Map<String, Boolean> parsedStringMap = parseInputDONString(inputString);

			String modelString = getModelString(employee);
			if (modelString == null || parsedStringMap == null) {
				throw new Exception(
						"Failed to get model string Or parsedStringMap");
			}

			String[] dataMembersViaDON = splitsInputString(modelString,
					DON_SEPRATOR);
			if (dataMembersViaDON.length != parsedStringMap.size()
					|| !parsedStringMap.containsKey(dataMembersViaDON[0]))
				return false;
			return checkObjectType(parsedStringMap, dataMembersViaDON);

		} catch (Exception e) {
			System.out.println("Exception occurred " + e.getMessage());
			return false;
		}
	}

	@Override
	public Map<String, Boolean> parseInputDONString(final String inputString) {
		Map<String, Boolean> parsedStringMap = new HashMap<String, Boolean>();
		String[] dataMembers = splitsInputString(inputString, DON_SEPRATOR);
		if (dataMembers == null)
			return null;
		for (int i = 0; i < dataMembers.length; i++) {
			parsedStringMap.put(dataMembers[i], false);
		}

		return parsedStringMap;

	}

	@Override
	public String getModelString(Object object) {
		return ((Employee) object).toString();
	}

	private String[] splitsInputString(final String input, final String regex) {
		if (input == null || regex == null)
			return null;
		String inputString = input;
		inputString = inputString.replace("|", ",");
		String[] dataMembers = inputString.split(",");

		for (int i = 0; i < dataMembers.length; i++) {
			dataMembers[i] = (dataMembers[i].split(":")[0]).replace(" ", "");
		}
		return dataMembers;
	}

	@Override
	public boolean checkObjectType(Map<String, Boolean> m, String[] s) {
		int x = 1;
		for (; x < s.length; x++)
			if (!m.containsKey(s[x]))
				return false;
		return true;
	}

	
}
