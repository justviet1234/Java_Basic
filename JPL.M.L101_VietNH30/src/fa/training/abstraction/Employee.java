package fa.training.abstraction;

import java.util.Scanner;

public abstract class Employee {
	private String employeeName;
	private String dateOfBirth;
	private String address;
	private static String companyName;

	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}

	protected void inputData(Scanner scanner) {
	System.out.println("Enter name: ");
	employeeName = scanner.nextLine();
	System.out.println("Enter birth date: ");
	dateOfBirth = scanner.nextLine();
	System.out.println("Address: ");
	address = scanner.nextLine();
	}

    protected void display() {
	System.out.print(employeeName + "\t" + dateOfBirth + "\t" + address +
	"\t" + companyName);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public abstract double calcSalary();
}
