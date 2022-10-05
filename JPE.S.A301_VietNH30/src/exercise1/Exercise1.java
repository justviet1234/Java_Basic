package exercise1;

import java.util.Scanner;

public class Exercise1 {
	public static void sumInt(double m, double n) {
		double sh = (n - m) / 1 + 1;
		double sum = ((m + n) * sh) / 2;
		System.out.println("Sum of m to n: " + sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		double m = sc.nextDouble();
		System.out.print("Enter n: ");
		double n = sc.nextDouble();
		sumInt(m, n);

	}

}
