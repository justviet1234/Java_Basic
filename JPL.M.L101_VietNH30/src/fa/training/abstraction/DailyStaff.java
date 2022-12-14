package fa.training.abstraction;

import java.util.Scanner;

public class DailyStaff extends Employee {
	private static final int WAGE_DAY = 15;
	private double numbeOfWorkday;
	@Override
	public double calcSalary() {
	return numbeOfWorkday * WAGE_DAY;
	}
	@Override
	protected void inputData(Scanner scanner) {
	super.inputData(scanner);
	System.out.println("Enter number of workday: ");
	numbeOfWorkday = Double.parseDouble(scanner.nextLine());
	System.out.println("---------------------------");
	}
	@Override
	protected void display() {
	super.display();
	System.out.print("\t" + numbeOfWorkday + "\t" + this.calcSalary() + "\n");
	}
}
