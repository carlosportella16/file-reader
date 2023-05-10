package file.reader;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String age;
	private String salary;
	private String department;

	public Employee() {

	}

	public Employee(String name, String email, String age, String salary, String department) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [" + name + ", " + email + ", " + age + ", " + salary + ", "
				+ department + "]";
	}

}
