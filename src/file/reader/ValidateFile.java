package file.reader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateFile {

	public static boolean isValid(Employee employee) {

		// Validating name
		if (employee.getName() == null || employee.getName().isBlank() || employee.getName().isEmpty() || !isValidName(employee.getName())) {
			return false;
		}

		// Validating Email
		if (employee.getEmail() == null || employee.getEmail().isBlank() || employee.getEmail().isEmpty()
				|| !isValidEmail(employee.getEmail())) {
			return false;
		}

		// Validating Age
		if (employee.getAge() == null || employee.getAge().isBlank() || employee.getAge().isEmpty() || !isValidAge(employee.getAge())) {
			return false;
		}

		// Validating Salary
		if (employee.getSalary() == null || employee.getSalary().isBlank() || employee.getSalary().isEmpty() || !isValidSalary(employee.getSalary())) {
			return false;
		}

		// Validating Department
		if (employee.getDepartment() == null || employee.getDepartment().isBlank()
				|| employee.getDepartment().isEmpty()) {
			return false;
		}

		return true;
	}

	private static boolean isValidName(String name) {
		String regex = "^[A-Za-z]+([ '-][A-Za-z]+)*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
	}

	private static boolean isValidEmail(String email) {
		String regex = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	private static boolean isValidAge(String age) {
		String regex = "^\\d+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(age);
		return matcher.matches();
	}

	private static boolean isValidSalary(String salary) {
		String regex = "^\\d+(\\.\\d+)?$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(salary);
		return matcher.matches();
	}
}
