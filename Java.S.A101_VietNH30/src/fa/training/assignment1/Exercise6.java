package fa.training.assignment1;

import java.util.Scanner;

public class Exercise6 {
	public static void rectangleExercise(double width, double height) {
		System.out.println("Area is " + width + " * " + height + " = " + (width * height));
		System.out.println("Perimeter is " + "2 * (" + width + " + " + height + ") = " + (2 * (width * height)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Width = ");
		double width = sc.nextDouble();
		System.out.print("Height = ");
		double height = sc.nextDouble();
		rectangleExercise(width, height);
	}
}
