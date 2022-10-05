package Ex2;

import java.util.Scanner;

public class Shopping {
	public static int inputint() {
		Scanner input = new Scanner(System.in);
		int b;
		while (true) {
			try {
				b = Integer.parseInt(input.nextLine().trim());
				if (b > 0)
					return b;
				else {
					System.out.println("Number must greater than 0");
					System.out.println("Enter again:");
				}
			} catch (Exception e) {
				System.out.println("Number must be Integer");
				System.out.println("Enter again:");
			}
		}
	}

	public static void main(String[] args) {
		Person p = new Person();
		Wallet w = new Wallet();
		System.out.println("======= Shopping program ==========");
		System.out.print("Input number of bill: ");
		int NumBill = inputint();
		int[] Bills = new int[NumBill];
		for (int i = 0; i < Bills.length; i++) {
			System.out.print("Input value of bill " + (i + 1) + ": ");
			Bills[i] = inputint();
		}
		System.out.println("input value of wallet: ");
		int wallet = inputint();
		w.setMoney(wallet);
		int TotalBill = p.calcTotal(Bills);
		System.out.println("This is total of bill: " + TotalBill);
		if (w.Payment(TotalBill)) {
			System.out.println("You can buy it.");
		} else {
			System.out.println("You can't buy it.");
		}
	}
}
