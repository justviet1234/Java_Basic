package fa.training.main;

import fa.training.entities.Truck;

import java.util.ArrayList;

import fa.training.entities.Ford;
import fa.training.entities.Sedan;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		ArrayList<Truck> listtruck = new ArrayList<Truck>();
		Truck truck1 = new Truck(100,900,"violet",2200);
		Truck truck2 = new Truck(100,500,"red",1500);
		listtruck.add(truck1);
		listtruck.add(truck2);
		for (Truck truck : listtruck) {
			System.out.println(truck);
			System.out.println("Discount Price: "+truck.getSalePrice());
		}
		ArrayList<Ford> listford = new ArrayList<Ford>();
		Ford ford1 = new Ford(100,900,"yellow",2022,300);
		Ford ford2 = new Ford(300,1500,"blue",2020,100);
		listford.add(ford1);
		listford.add(ford2);
		for (Ford ford : listford) {
			System.out.println(ford);
			System.out.println("Discount Price: "+ford.getSalePrice());
		}
		ArrayList<Sedan> listsedan = new ArrayList<Sedan>();
		Sedan sedan1 = new Sedan(100,900,"orange",30);
		Sedan sedan2 = new Sedan(100,900,"green",30);
		for (Sedan sedan : listsedan) {
			System.out.println(sedan);
			System.out.println("Discount Price: "+sedan.getSalePrice());
		}
	}
}
