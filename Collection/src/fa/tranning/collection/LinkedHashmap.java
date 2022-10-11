package fa.tranning.collection;

import java.util.LinkedHashMap;

public class LinkedHashmap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("one", "practice.geeksforgeeks.org");
		lhm.put("two", "code.geeksforgeeks.org");
		lhm.put("four", "quiz.geeksforgeeks.org");
		System.out.println(lhm);
		System.out.println("Getting value for key 'one': " + lhm.get("one"));
		System.out.println("Size of the map: " + lhm.size());
		System.out.println("Is map empty? " + lhm.isEmpty());
		System.out.println("Contains key 'two'? " + lhm.containsKey("two"));
		System.out.println("Contains value 'practice.geeks" + "forgeeks.org'? "
				+ lhm.containsValue("practice" + ".geeksforgeeks.org"));
		System.out.println("delete element 'one': " + lhm.remove("one"));
		System.out.println("Mappings of LinkedHashMap : " + lhm);
	}
}
