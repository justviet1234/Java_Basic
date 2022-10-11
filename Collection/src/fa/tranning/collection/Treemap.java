package fa.tranning.collection;

import java.util.TreeMap;

public class Treemap {
	static void Example1stConstructor() {
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		tree_map.put(10, "Geeks");
		tree_map.put(15, "4");
		tree_map.put(20, "Geeks");
		tree_map.put(25, "Welcomes");
		tree_map.put(30, "You");
		System.out.println("TreeMap: " + tree_map);
	}

	public static void main(String[] args) {
		System.out.println("TreeMap using " + "TreeMap() constructor:\n");
		Example1stConstructor();
	}
}
