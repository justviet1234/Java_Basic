package exercise4;

public class ArrayReverse {
	static void reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}
		System.out.print("Reversed Array: ");
		for (int k = 0; k < n; k++) {
			System.out.print(b[k]+ " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
		System.out.print("Original Array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("");
		reverse(a, a.length);
	}
}
