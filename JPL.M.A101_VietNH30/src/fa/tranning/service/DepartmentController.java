package fa.tranning.service;

import java.util.ArrayList;
import java.util.List;

import fa.tranning.utils.*;
import fa.tranning.entities.*;

public class DepartmentController {
	validation validation = new validation();
	public static List<Department> departments = new ArrayList<>();

	private static final String EMAIL_VALID = "^[a-zA-Z][a-zA-Z0-9\\-_]+@[a-zA-Z]+(\\.[a-zA-Z]+){1,3}$";
	private static final String PHONE_VALID = "^[0-9]{7,11}$";
	private static final String STRING_VALID = "[A-Za-z\\s]+";
	private static final String SNN_VALID = "^[0-9]{9,12}$";

	public static void menu() {
		System.out.println("1. Create a new employee.");
		System.out.println("2. Display employees.");
		System.out.println("3. Classify employees.");
		System.out.println("4. Employee Search.");
		System.out.println("5. Report.");
		System.out.println("6. Exist.");
	}

	public void create() {
		int numberOfDepartment = validation.inputInt("Please enter number of department: ", 1, Integer.MAX_VALUE);
		int count = 0;
		for (int i = 0; i < numberOfDepartment; i++) {
			String departmentName = validation.inputString("Enter department " + (i + 1) + " name : ", STRING_VALID);
			departments.add(new Department(departmentName));
		}
		for (int i = 0; i < numberOfDepartment; i++) {
			System.out.println("Enter employee in " + departments.get(i).getDepartName() + ": ");
			while (true) {
				String snn;
				while (true) {
					snn = validation.inputString("Enter SNN(Social Security Number): ", SNN_VALID);
					if (validation.checkIdExist(departments, snn)) {
						break;
					} else {
						System.out.println("SNN exist.");
					}
				}
				String firstName = validation.inputString("Enter first name: ", STRING_VALID);
				String lastName = validation.inputString("Enter last name: ", STRING_VALID);
				String birthDate = validation.inputDate("Enter birthdate: ");
				String address = validation.inputString("Enter address: ", STRING_VALID);
				String phone = validation.inputString("Enrer phone: ", PHONE_VALID);
				String email = validation.inputString("Enter email: ", EMAIL_VALID);
				System.out.println("=====Employee Disboard=====");
				System.out.println("1.Hourly Employee");
				System.out.println("2.Sales Employee");
				int type = validation.inputInt("Enter type of employee you want to input: ", 1, 2);
				switch (type) {
				case 1:
					double rate = validation.inputDouble("Enter rate: ", 0, 5);
					double workingHours = validation.inputDouble("Enter working hours: ", 0, 24 * 30);
					departments.get(i).getEmployee().add(new HourlyEmployee(snn, firstName, lastName, address, birthDate,phone, email, rate, workingHours));
					break;
				case 2:
					int numberUnits = validation.inputInt("Enter numberofUnits: ", 0, Integer.MAX_VALUE);
					departments.get(i).getEmployee().add(new SalesEmployee(snn, firstName, lastName, address, birthDate, phone, email, numberUnits));
					break;
				}
				System.out.print("Do you want to continue (Y/N): ");
				if (!validation.checkInputYN()) {
					count++;
					break;
				}
				if (departments.size() == count) {
					return;
				}
			}

		}
	}

	public void display() {
		if (departments.isEmpty()) {
			System.out.println("Don't have any department.");
			return;
		}
		System.out.println("======All Employee In Each Department======");
		for (int i = 0; i < departments.size(); i++) {
			System.out.println(departments.get(i).getDepartName());
			for (int j = 0; j < departments.get(i).getEmployee().size(); j++) {
				System.out.println(departments.get(i).getEmployee().get(j).toString());
			}
		}
	}

	public void classify() {
		if (departments.isEmpty()) {
			System.out.println("Don't have any department.");
			return;
		}
		System.out.println("Sales Employee: ");

		for (int i = 0; i < departments.size(); i++) {
			for (int j = 0; j < departments.get(i).getEmployee().size(); j++) {
				if (departments.get(i).getEmployee().get(j) instanceof SalesEmployee) {
					System.out.println(departments.get(i).getEmployee().get(j).toString());
				}
			}
		}
		System.out.println("Hourly Employee: ");
		for (int i = 0; i < departments.size(); i++) {
			for (int j = 0; j < departments.get(i).getEmployee().size(); j++) {
				if (departments.get(i).getEmployee().get(j) instanceof HourlyEmployee) {
					System.out.println(departments.get(i).getEmployee().get(j).toString());
				}
			}
		}
	}

	public void search() {
		while (true) {
			String search = validation.inputString("Enter department you want to search: ", STRING_VALID);
			for (int i = 0; i < departments.size(); i++) {
				if (departments.get(i).getDepartName().toLowerCase().contains(search.toLowerCase())) {
					for (int j = 0; j < departments.get(i).getEmployee().size(); j++) {
						System.out.println(departments.get(i).getEmployee().get(j).toString());
					}
					String ename = validation.inputString("Enter student you want to search: ", STRING_VALID);
					for (int j = 0; j < departments.get(i).getEmployee().size(); j++) {
						if (departments.get(i).getEmployee().get(j).getFirstName().equals(ename)
								|| departments.get(i).getEmployee().get(j).getLastName().equals(ename)
								|| ename.equals(departments.get(i).getEmployee().get(j).getFirstName() + " "
										+ departments.get(i).getEmployee().get(j).getLastName())) {
							System.out.println(departments.get(i).getEmployee().get(j).toString());
						} else {
							System.out.println("Not found employee.");
							break;
						}
					}
				}
			}
			System.out.print("Do you want to continue (Y/N): ");
			if (!validation.checkInputYN()) {
				return;
			}
		}
	}

	public void report() {
		for (int i = 0; i < departments.size(); i++) {
			System.out.format("%s |%d \n ", departments.get(i).getDepartName(), departments.get(i).getEmployee().size());
			System.out.println();
		}
	}
}
