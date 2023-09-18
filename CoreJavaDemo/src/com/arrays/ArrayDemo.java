package com.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		/**
		 * collection of data
		 * int n1 = 23;// marks of 5 subject
		 * n2, n3, n4 n5
		 * n1+n2+n3
		 * marks => 10,20,50,23,23
		 * an array is a special variable that stores more than 1 value of same type to perform some common mathematical operations
		 * once created the size is fixed
		 * bag = 5kgs , 3kgs
		 * index => used to access or store a value at  a particular location/position
		 * index always start from 0
		 * array can hold 5 items=> 0 to 4
		 * continous memomory locations
		 * []
		 */
		int x = 10;// declaration and assignment/initialization
		int y;
		y=10;
		int arr[];// declaration of an array variable
		//int []arr;
		// specify the size, create the arry for java to block that much memory
		// new => to allocate memory
		arr = new int[5];//int => 4 bytes => 5*4 = 20 bytes
		System.out.println(arr.length);
		System.out.println(arr[0]);
		Scanner sc = new Scanner(System.in);

		//		for(int i=0;i<arr.length;i++) {
		//			System.out.println("enter value "+(i+1));
		//			arr[i] = sc.nextInt();
		//		}
		//
		//		for(int i=0;i<arr.length;i++)
		//			System.out.println(arr[i]);

		// declare and create an array in 1 line
		int temps[] = new int[5];
		// declare, create and initialize the values
		char vowels[] = {'a','e','p','o','u'};
		vowels[2]= 'i';
		//vowels[5] = 's';

		/**
		 * 
		 * items[] ={"bread", "eggs","bananas"..}
		 * price[] = {45, 32, 45..}
		 * admin is user
		 * 1. ask for customer name, shalini(string)
		 * 2. display the menu from items and price ask the customer to enter sno for the item to purchase : 
		 * Sno Itemname Price
		 * 1	bread	45
		 * 2	eggs(6)	20
		 * 
		 * which item to purchase
		 * 3. enter qty for that item
		 * 4. do you want to purchase more items? if yes, repeat steps 2 to 4. 
		 * 5. if no , total amt to be paid by shalini
		 * 6. ask are there more customers: Y/N, how to take character input using scanner
		 * 7. if Y Repeat steps 1 to 6 else display a message "Thanks"
		 */
		String items[] ={"bread", "eggs","bananas","milk","cookies"};
		double price[] = {45,35,50,48,20};

		char ans = 'Y';
		do {
			
			System.out.println("Enter customer name");
			String name = sc.next();
			int sum = 0;
			while(true) {
				System.out.println("choose an item to purchase");
				System.out.println("SNO\tName\t\tPrice");
				for (int i = 0; i < items.length; i++) {
					System.out.println((i+1)+"\t"+items[i]+"\t\t"+price[i]);
				}
				int itemno = sc.nextInt();
				
				System.out.println("Enter qty");
				int qty = sc.nextInt();
	
				sum += qty * price[itemno-1];
				System.out.println("Do you want to purchase more items? Enter Y/N");
				char choice = sc.next().charAt(0);
				if(choice != 'Y') break;
			}
			System.out.println("Customer Name "+name);
			System.out.println("Total amount : "+sum);
			System.out.println("************************************");
			System.out.println("Any more customers");
			ans = sc.next().charAt(0);
		}while(ans == 'Y' || ans == 'y');
		System.out.println("Thanks!!!");


	}

}
