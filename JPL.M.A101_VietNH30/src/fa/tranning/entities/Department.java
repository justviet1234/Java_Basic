package fa.tranning.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	String DepartName;
	List<Employee> employee;

	public Department() {

	}

	public Department(String departName) {
		super();
		this.DepartName = departName;
		employee = new ArrayList<>();
	}

	public String getDepartName() {
		return DepartName;
	}

	public void setDepartName(String departName) {
		DepartName = departName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [DepartName=" + DepartName + ", employee=" + employee + "]";
	}

}
