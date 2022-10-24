package fa.training.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Validation {
	Scanner sc = new Scanner(System.in);
	public int inputInt(String mess, int min, int max) {
		System.out.println(mess);
		while (true) {
			String input = sc.nextLine();
			try {
				int number = Integer.parseInt(input);
				// check range of number
				if (number < min || number > max) {
					System.out.print("Please input between " + min + ", " + max + ": ");
					continue;
				}
				return number;
			} catch (Exception e) {
				System.out.print("Please input an integer number: ");
			}
		}
	}
	public double inputDouble(String mess, double min, double max) {
		System.out.print(mess);
		while (true) {
			String input = sc.nextLine();
			try {
				double number = Double.parseDouble(input);
				if (number < min || number > max) {
					System.out.print("Please input between " + min + ", " + max + ": ");
					continue;
				}
				return number;
			} catch (Exception e) {
				System.out.print("Please input an double number: ");
			}
		}
	}
	public String inputString(String mess,String regex) {
		System.out.println(mess);
		while (true) {
			String input = sc.nextLine();
			if (!input.matches(regex)) {
				System.out.println("Please input matches regex:" + regex);
				continue;
			}
			if (input.equals("")) {
				System.out.print("Please input a non-empty string: ");
				continue;
			}
			return input;
		}
	}
	public Date inputDate(String mess) {
		System.out.print(mess);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		while (true) {
			String input = sc.nextLine();
			try {
				Date date = (Date) dateFormat.parse(input);
				// get current date
				Date curDate = (Date) Calendar.getInstance().getTime();
				// check range of date
				if (curDate.compareTo(date) < 0) {
					System.out.print("Please input date that before current date: ");
					continue;
				}			
				return date;
			} catch (Exception e) {
				System.out.print("Please input valid date (dd/MM/yyyy): ");
			}
		}
	}
	public boolean checkInputYN() {
		while (true) {
			String result = sc.nextLine();
			if (result.equalsIgnoreCase("Y")) {
				return true;
			} else if (result.equalsIgnoreCase("N")) {
				return false;
			}
			System.err.println("Please input y/Y or n/N.");
			System.out.print("Enter again: ");
		}
	}

}
