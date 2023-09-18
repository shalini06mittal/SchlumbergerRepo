package com.loops;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		// to print table of 5, 10 15 20 ..50
		/**
		 * 1 2 3 4 5 .. 10
		 * 2 4 6 8 10..20
		 * 3 6 9 ...30
		 * 4..
		 * 5...
		 */
		for(int n = 1;n<=5;n++){//n=5, outer loop
			for(int i=1;i<=10;i++){//inner loop, 1 to 10
				System.out.print(n*i+" ");
			}
			System.out.println();
		}
		
		/**
		 * admin is user
		 * 1. ask for customer name, shalini(string)
		 * 2. ask how many items purchased by the customer, 2
		 * 3. enter price and qty for item 1
		 * 4. enter price(double) and qty(int) for item 2
		 * 5. total amt to be paid by shalini
		 * 6. ask are there more customers: Y/N, how to take character input using scanner
		 * 7. if Y Repeat steps 1 to 6 else display a message "Thanks"
		 */
		Scanner sc = new Scanner(System.in);
		char ans = 'Y';
		do {
			System.out.println("Enter customer name");
			String name = sc.next();
			System.out.println("Enter items purchased");
			int items = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= items; i++) {
				System.out.println("Enter qty");
				int qty = sc.nextInt();
				System.out.println("Enter price");
				double price = sc.nextDouble();
				sum += qty * price;
			}
			System.out.println("Customer Name "+name);
			System.out.println("Total amount : "+sum);
			System.out.println("Any more customers");
			ans = sc.next().charAt(0);
		}while(ans == 'Y' || ans == 'y');
		System.out.println("Thanks!!!");

	}

}
