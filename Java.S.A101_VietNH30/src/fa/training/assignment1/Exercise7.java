package fa.training.assignment1;

import java.util.Scanner;

public class Exercise7 {
	public static void logicalExercise(int number1, int number2) {
		if (number1 != number2) {
			System.out.println(number1 + " != " + number2);
		}
		if (number1 > number2) {
			System.out.println(number1 + " > " + number2);
		}
		if (number1 < number2) {
			System.out.println(number1 + " < " + number2);
		}
		if (number1 == number2) {
			System.out.println(number1 + " = " + number2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int number1 = sc.nextInt();
		System.out.print("Input second integer: ");
		int number2 = sc.nextInt();
		logicalExercise(number1, number2);
	}
}
