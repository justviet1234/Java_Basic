package exercise.helloworld;

public class HelloWorld {

//	public static void bubblesort(int[] arr) {
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - 1; j++) {
//				if (arr[j] < arr[j + 1]) {
//					temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//	}

	public static void main(String[] args) {
//		int[] a = { 3, 9, 6, 8, 0, 12, 20, 18 };
//		System.out.print("Sorted array: ");
//		bubblesort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		int num1 = 11; /* 11 = 00001011 */
		int num2 = 22; /* 22 = 00010110 */
		int result = 0;
		result = num1 & num2;
		System.out.println("num1 & num2: " + result);
		result = num1 | num2;
		System.out.println("num1 | num2: " + result);
		result = num1 ^ num2; // generates 1 if they are not equal, else it returns 0.
		System.out.println("num1 ^ num2: " + result);
		result = ~num1;// changes the bit from 0 to 1 and 1 to 0.
		System.out.println("~num1: " + result);
		result = num1 << 2;
		System.out.println("num1 << 2: " + result);
		result = num1 >> 2;
		System.out.println("num1 >> 2: " + result);
}

}
