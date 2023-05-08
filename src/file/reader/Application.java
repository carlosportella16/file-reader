package file.reader;

import java.util.List;

public class Application {

	public static final String VALID_FILE = "data.xlsx";
	public static final String HEADER_FILE = "";

	public static void main(String[] args) {
		ReaderFile reader = new ReaderFile();
		List<Employee> list = reader.readEmployeeXLSXFile(VALID_FILE);
		System.out.println(list);
	}
}
