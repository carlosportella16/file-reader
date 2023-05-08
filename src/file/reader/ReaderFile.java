package file.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReaderFile {
	public List<Employee> readEmployeeXLSXFile(String fileName) {

		List<Employee> employees = new ArrayList<>();
		try {
			FileInputStream file = new FileInputStream(new File(fileName));

			// Create a workbook to select all the spreads
			XSSFWorkbook workBook = new XSSFWorkbook(file);

			// Select just the first spread
			XSSFSheet sheet = workBook.getSheetAt(0);

			Iterator<Row> rowIterator = sheet.iterator();

			// verify all rows
			while (rowIterator.hasNext()) {
				// get line
				Row row = rowIterator.next();

				// get all the cells of this line
				Iterator<Cell> cellIterator = row.cellIterator();

				Employee employee = new Employee();

				while (cellIterator.hasNext()) {
					Cell currentCell = cellIterator.next();
					int columnIndex = currentCell.getColumnIndex();
					switch (columnIndex) {
					case 0:
						employee.setName(currentCell.getStringCellValue());
						break;
					case 1:
						employee.setEmail(currentCell.getStringCellValue());
						break;
					case 2:
						employee.setAge((int) currentCell.getNumericCellValue());
						break;
					case 3:
						employee.setSalary(currentCell.getNumericCellValue());
						break;
					case 4:
						employee.setDepartment(currentCell.getStringCellValue());
						break;
					}
				}
				employees.add(employee);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return employees;
	}

}
