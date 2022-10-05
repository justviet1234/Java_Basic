package exercise2;

import java.util.Scanner;

public class ArrayContains {
	public static void enterArray(String[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("Element " + i + " : ");
			a[i] = sc.nextLine();
		}
	}

	public static void checkElement(String[] a) {
		Scanner sc = new Scanner(System.in);
		String ValueCheck;
		System.out.print("Enter check value: ");
		ValueCheck = sc.nextLine();
		for (int i = 0; i < a.length; i++) {
			if (ValueCheck.equals(a[i])) {
				System.out.println("Check '" + ValueCheck + "' in Array: Contain!");
				break;
			} else if (i == a.length - 1) {
				System.out.println("Check '" + ValueCheck + "' in Array: No Contain!");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		int element = sc.nextInt();
		String[] a = new String[element];
		enterArray(a);
		checkElement(a);
	}
}
