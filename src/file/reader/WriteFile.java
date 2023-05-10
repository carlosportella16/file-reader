package file.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {

	public void write(List<Employee> employeeList, String file) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file)))
		{
			for (Employee employee : employeeList) {
				writer.write(employee.getName() + ", " + employee.getEmail() + ", " + employee.getSalary() + ", "
						+ employee.getAge() + ", " + employee.getDepartment());
				writer.newLine();
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
