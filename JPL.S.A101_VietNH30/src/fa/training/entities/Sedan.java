package fa.training.entities;

public class Sedan extends Car {
	int lenght;

	public Sedan() {

	}

	public Sedan(int speed, double regularPrice, String color, int lenght) {
		super(speed, regularPrice, color);
		this.lenght = lenght;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public double getSalePrice() {
		if (lenght > 20) {
			return (regularPrice - ((regularPrice * 5) / 100));
		} else {
			return (regularPrice - ((regularPrice * 10) / 100));
		}
	}

	@Override
	public String toString() {
		return "Sedan [speed= " + speed + ", regularPrice= " + regularPrice + ", color= " + color + ", lenght= " + lenght
				+ "]";
	}

}
