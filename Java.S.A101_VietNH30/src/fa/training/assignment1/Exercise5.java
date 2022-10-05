package fa.training.assignment1;

import java.util.Scanner;

public class Exercise5 {
	public static void circleExercise(double radius) {
		System.out.println("Perimeter is = " + (radius * 2 * Math.PI));
		System.out.println("Area is = " + (radius * radius * Math.PI));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius = ");
		double radius = sc.nextDouble();
		circleExercise(radius);
	}
}
