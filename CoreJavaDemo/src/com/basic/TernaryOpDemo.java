package com.basic;

import java.io.IOException;
import java.util.Scanner;

public class TernaryOpDemo {

	public static void main(String[] args) throws IOException {
		// ? :
		/** 
		 * sequence
		 * conditional and alter the flow of the program
		 * 
		 * expression => evaluate to a boolean result
		 * expression? <true> : false>
		 */
		// check if a user can vote
		
		
//		int x = System.in.read();
//		System.out.println(x);
		
		Scanner sc = new Scanner(System.in); // write only once
//		System.out.println("Please enter your name");
////		String name = sc.next(); // word
//		String name = sc.nextLine(); // sentence
//		System.out.println("Please enter your age");
//		int age = sc.nextInt();
//		
//		String res = (age >= 18) ? " can vote" : " cannot vote";
//		System.out.println(name+res);
		
		System.out.println("Enter 2 nos");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
//		int max = n1 > n2 ? n1 : n2;
//		System.out.println("Max of "+n1+" "+n2+" : "+max);
		
		int max = (n1 > n2 ? n1 :( n2 > n1 ? n2 : 0));
		System.out.println("Max of "+n1+" "+n2+" : "+(max==0 ? "both equal": max));
		/**
		 * Take cost price and selling price as input and print if it is profit or loss
		 */
		System.out.println("Enter cp");
		double cp = sc.nextDouble();
		System.out.println("Enter sp");
		double sp = sc.nextDouble();
		System.out.println(cp>sp? "Loss":"Profit");
	}

}
