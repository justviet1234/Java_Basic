package Ex1;

import java.util.Scanner;

public class Triangle extends Shape {
	double sideA;
	double sideB;
	double sideC;

	public Triangle() {
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	double getPerimeter() {
		return sideA + sideB + sideC;
	}

	@Override
	double getArea() {
		double p = (sideA + sideB +sideC)/2;
		return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}
	@Override
	void printResult() {
		System.out.println(toString());
		
	}


	@Override
	void inputData() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("Please input side A of Triangle: ");
			sideA = Double.parseDouble(sc.nextLine().trim());
			System.out.println("Please input side B of Triangle: ");
			sideB = Double.parseDouble(sc.nextLine().trim());
			System.out.println("Please input side C of Triangle: ");
			sideC = Double.parseDouble(sc.nextLine().trim());
			if (sideA > 0 && sideB > 0 && sideC > 0 && ((sideA+sideB)>sideC) && ((sideA+sideC)>sideB) && ((sideB+sideC)>sideA)) {
				return;
			}else {
				System.out.println("This is not a Triangle");
				System.out.println("Enter again:");
			}
			}catch (Exception e) {
				 System.out.println("Side of Triangle must be Double");
	             System.out.println("Enter again:");
			}
		}
		
	}

	@Override
	public String toString() {
		return 	"-----Triangle-----"+
				"\nSideA: " + sideA +
				"\nsideB:"+ sideB +
				"\nsideC: " + sideC +
				"\nArea: " + getArea()+
				"\nPerimeter: "+ getPerimeter();
	}


}
