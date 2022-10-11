package StringDemo;

public class StringMethodDemo {
	public static void main(String[] args) {
		String s = "Demo";
		s = s.concat(" string").concat(" method");
		System.out.println(s);
		String s1 = "   Hello World     ";
		System.out.println("s1 before trim "+ s1);
		System.out.println("s1 after trim: "+s1.trim());
		
	}
}
