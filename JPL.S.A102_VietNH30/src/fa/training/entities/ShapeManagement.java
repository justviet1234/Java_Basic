package fa.training.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShapeManagement {
	static Scanner sc = new Scanner((System.in));
	static List<Rectangle> list = new ArrayList<>();
	public static int InputInt(String mess) {
		while (true) {
			try {
				System.out.println(mess);
				int a = Integer.parseInt(sc.nextLine().trim());
				if (a > 0) {
					return a;
				} else {
					System.out.println("Number must be greater than 0");
					System.out.println("Enter again: ");
				}
			} catch (Exception e) {
				System.out.println("Number must be Integer");
				System.out.println("Enter again: ");
			}
		}
	}

	public static void displayRectangle() {
		if (list.isEmpty()) {
			System.out.println("Don't have any data to display.");
		}
		for (int i = 0; i < list.size(); i++) {
			 
				System.out.println("Rectangle "+(i+1));
				System.out.println("Lenght: "+list.get(i).getLength());
				System.out.println("Width: "+list.get(i).getWidth());
				System.out.println("Area: "+list.get(i).calculateArea());
				System.out.println("Perimeter: "+list.get(i).calculatePerimeter());
			}
		}
	

	public static void getMaxArea() {
		if (list.isEmpty()) {
			System.out.println("Don't have any data to display.");
		} else {
			int maxArea = list.get(0).calculateArea();
			int flag = 0;
			for (int i = 0; i < list.size(); i++) {
				if (maxArea < list.get(i).calculateArea()) {
					flag = i;
				}
			}
			System.out.println("Lenght: "+list.get(flag).getLength());
			System.out.println("Width: "+list.get(flag).getWidth());
			System.out.println("Area: "+list.get(flag).calculateArea());
			System.out.println("Perimeter: "+list.get(flag).calculatePerimeter());
		}
	}
	public static void getMinPerimeter() {
		if (list.isEmpty()) {
			System.out.println("Don't have any data to display.");
		} else {
			int minPerimeter = list.get(0).calculatePerimeter();
			int flag = 0;
			for (int i = 0; i < list.size(); i++) {
				if (minPerimeter > list.get(i).calculateArea()) {
					flag = i;
				}
			}
			System.out.println("Lenght: "+list.get(flag).getLength());
			System.out.println("Width: "+list.get(flag).getWidth());
			System.out.println("Area: "+list.get(flag).calculateArea());
			System.out.println("Perimeter: "+list.get(flag).calculatePerimeter());
		}
	}
	public static void GetRetangle() {
		while(true) {
			int lenght = InputInt("Enter length: ");
			int width = InputInt("Enter width: ");
			Rectangle r = new Rectangle(lenght, width);
			if(lenght > width) {
				list.add(r);
				break;
			}else {
				System.out.println("length must be greater than width");
			}
		}
	}

}
