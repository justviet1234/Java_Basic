package fa.training.main;

import java.util.Scanner;

import fa.training.entities.Rectangle;
import fa.training.entities.Shape;
import fa.training.entities.ShapeManagement;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShapeManagement sm = new ShapeManagement();
		int size = sm.InputInt("Enter size of array: ");
		for (int i = 0; i < size; i++) {
			System.out.println("Rectangle "+(i+1)+":");
			sm.GetRetangle();
		}
		sm.displayRectangle();
		System.out.println("Regtangle has max area:");
		sm.getMaxArea();
		System.out.println("Rectangle has min perimeter:");
		sm.getMinPerimeter();
		

}
}
