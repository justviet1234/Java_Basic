package exercise5;

public class CommonElements {
	public static void FindCommonElemet(int[] a, int[] b) {
		System.out.print("Common elements: ");
		 for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < b.length; j++) {
	                if (a[i] == b[j]) {
	                    System.out.print(a[i] + " ");
	                    break;
	                }
	            }
	        }
	}
	public static void main(String[] args) {
		int[] myIntArray1 = { 43, 32, 53 };
		int[] myIntArray2 = { 43, 13, 72, 23};
		FindCommonElemet(myIntArray1, myIntArray2);
		
	}
}
