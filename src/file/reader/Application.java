package file.reader;

import java.util.List;
import java.util.stream.Collectors;

public class Application {

	public static final String FILE = "data.xlsx";
	public static final String VALID_LIST = "valid-list.txt";
	public static final String INVALID_LIST = "invalid-list.txt";

	public static void main(String[] args) {
		ReaderFile reader = new ReaderFile();
		WriteFile writeFile = new WriteFile();

		// Reading the file
		List<Employee> allEmployess = reader.readEmployeeXLSXFile(FILE);

		// Separing the valid List
		List<Employee> validList = allEmployess.stream().filter(employee -> ValidateFile.isValid(employee))
				.collect(Collectors.toList());

		// Separing the invalid List
		List<Employee> invalidList = allEmployess.stream().filter(employee -> !ValidateFile.isValid(employee))
				.collect(Collectors.toList());

		// Writing the valid list
		writeFile.write(validList, VALID_LIST);

		// Writing the invalid list
		writeFile.write(invalidList, INVALID_LIST);

		
		// Printing the file
		System.out.println("==============COMPLETE LIST==============");
		allEmployess.forEach(System.out::println);
		System.out.println();
		
		// Printing the valid list
		System.out.println("==============VALID LIST==============");
		validList.forEach(System.out::println);
		System.out.println();
		
		// Printing the valid list
		System.out.println("===============INVALID LIST==============");
		invalidList.forEach(System.out::println);

	}
}
