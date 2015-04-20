package testDriver;

import parser.IDONParser;
import parsers.EmployeeParser;
import model.Employee;

public class TestDriver {

	public TestDriver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		IDONParser parser = new EmployeeParser();
		String inputString = "Employee|id:" + 2 + ", name:" + "Nitin"
				+ ", salary:" + 234 + ", item:"+3;
		System.out.println(parser.validateObjectType(inputString, e));

	}

}
