package StringDemo;

import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String[] args) {
		ArrayList<Animal> listofAnimal = new ArrayList<Animal>();
		listofAnimal.add(new Animal("Cat", 2.0f));
		listofAnimal.add(new Animal("Dog", 8.0f));
		listofAnimal.add(new Animal("Turtle", 1.2f));
		listofAnimal.add(new Animal("Bear", 60.0f));
		listofAnimal.add(new Animal("Rabbit", 1.6f));
		listofAnimal.add(new Animal("Bird", 0.6f));

		int arrSize = listofAnimal.size();
		for (int i = 0; i < arrSize; i++) {
			System.out.println(listofAnimal.get(i).getName() + "\t" + listofAnimal.get(i).getWeight());
		}
		// listofAnimal.remove(3);
	}
}
