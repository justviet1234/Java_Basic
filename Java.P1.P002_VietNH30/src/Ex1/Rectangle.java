package Ex1;

import java.util.Scanner;

public class Rectangle extends Shape {
	double lenght;
	double width;

	public Rectangle() {
	}

	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	void inputData() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Please input side width of Rectangle: ");
				width = Double.parseDouble(sc.nextLine().trim());
				System.out.println("Please input side lenght of Rectangle: ");
				lenght = Double.parseDouble(sc.nextLine().trim());
				if (lenght > 0 && width > 0 && lenght > width) {
					return;
				}else if(lenght < 0 || width < 0) {
					System.out.println("This is not a Rectangle, length and width must be greater than 0 ");
				}
				else {
					System.out.println("length must be longer than width");
					System.out.println("Enter again:");
				}
			} catch (Exception e) {
				System.out.println("length and width must be Double");
				System.out.println("Enter again:");
			}
		}
	}

	@Override
	double getPerimeter() {
		return ((lenght + width) * 2);
	}

	@Override
	double getArea() {
		return lenght * width;
	}

	@Override
	void printResult() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return 	"-----Rectangle-----"+
				"\nWidth: " + width +
				"\nLenght: " + lenght +
				"\nGetArea: " + getArea()+
				"\nPerimeter: " + getPerimeter();
	}
	

}
