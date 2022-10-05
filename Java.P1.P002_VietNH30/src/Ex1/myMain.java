package Ex1;
import Ex1.Triangle;
import Ex1.Rectangle;
import Ex1.Circle;
public class myMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		System.out.println("=====Calculator Shape Progarmer=====");
		r.inputData();
		c.inputData();
		t.inputData();
		r.getArea();
		r.getPerimeter();
		t.getArea();
		t.getPerimeter();
		c.getArea();
		c.getPerimeter();
		r.printResult();
		c.printResult();
		t.printResult();
		
	}
}
