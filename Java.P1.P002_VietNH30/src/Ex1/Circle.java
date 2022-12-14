package Ex1;

import java.util.Scanner;

public class Circle extends Shape {
	double radius;

	public Circle() {
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	void inputData() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Please input radius of Circle: ");
				radius = Double.parseDouble(sc.nextLine().trim());
				if (radius > 0) {
					return;
				} else {
					System.out.println("This is not a Circle, radius must be greater than 0");
					System.out.println("Enter again:");
				}
			} catch (Exception e) {
				System.out.println("radius must be Double");
				System.out.println("Enter again:");
			}
		}
	}

	@Override
	double getPerimeter() {
		return ((radius * 2) * Math.PI);
	}

	@Override
	double getArea() {
		return ((radius * radius) * Math.PI);
	}

	@Override
	void printResult() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "-----Circle-----"+
				"\nRadius: " + radius +
				"\nArea: " + getArea()+
				"\nPerimeter: " + getPerimeter();
	}
	

}
