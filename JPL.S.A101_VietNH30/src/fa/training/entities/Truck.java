package fa.training.entities;

public class Truck extends Car {
	protected int weight;

	public Truck() {

	}

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		if (weight > 2000) {
			return (regularPrice - ((regularPrice * 10) / 100));
		} else {
			return (regularPrice - ((regularPrice * 20) / 100));
		}
	}

	@Override
	public String toString() {
		return "Truck [speed= " + speed + ", regularPrice= " + regularPrice + ", color= " + color + ", weight= " + weight
				+ "]";
	}

}
