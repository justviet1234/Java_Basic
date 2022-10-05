package fa.training.assignment1;

import java.util.Scanner;

public class Exercise2 {
	public static void arithmeticExercise2(int number1, int number2) {
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
		System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
		System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
		System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int number1 = sc.nextInt();
		System.out.print("Input second number: ");
		int number2 = sc.nextInt();
		arithmeticExercise2(number1, number2);
	}
}
