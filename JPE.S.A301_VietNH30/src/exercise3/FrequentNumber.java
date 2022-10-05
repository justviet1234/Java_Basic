package exercise3;

import java.util.Scanner;

public class FrequentNumber {
	public static void enterArray(int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("Element " + (i + 1) + " : ");
			a[i] = Integer.parseInt(sc.nextLine());
			if (i != a.length - 1) {
				System.out.println("Do you want to continue ? Enter N/n");
				String YN = sc.nextLine();
				if (YN.equals("n")) {
					break;
				}
				if (YN.equals("N")) {
					continue;
				}
			}
		}
	}
	public static void index(int[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to find: ");
		int find = sc.nextInt();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (find == a[i]) {
				count++;
			}
		}
		System.out.println("Amount of frequence: "+count);
		System.out.print("Index: ");
		for (int i = 0; i < a.length; i++) {
			if (find == a[i]) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array lenght: ");
		int len = sc.nextInt();
		int[] a = new int[len];
		enterArray(a);
		index(a);
	}

}
