package com.conditional;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//		System.out.println("Enter cp");
		//		double cp = sc.nextDouble();
		//		System.out.println("Enter sp");
		//		double sp = sc.nextDouble();
		/**
		 * cp, sp
		 * p/l
		 * pa/la
		 * pp/lp
		 */
		// ternary can be used only to execute a single statement for T/F
		/**
		 * expression? <true> : false>
		 * 
		 * if-else
		 * 
		 * if(expression) {
		 * 		// statements to execute if espression is true
		 * }
		 * else{
		 * 		// statements to execute if espression is false
		 * }
		 */

		//		if(sp > cp) {
		//			double profitamt = sp - cp;
		//			double pp = profitamt/cp*100;
		//			System.out.println("Profit");
		//			System.out.println("Profit amount "+profitamt);
		//			System.out.println("Profit percentage "+pp);
		//		}
		//		else {
		//			double lossamt = cp - sp;
		//			double lp = lossamt/cp*100;
		//			System.out.println("Loss");
		//			System.out.println("Loss amount "+lossamt);
		//			System.out.println("Loss percentage "+lp);
		//		}
		//		
		/**
		 * curly braces are optional
		 * 
		 */
		int n1 =200, n2 = 34;
		//		if(n1>n2) {
		//			System.out.println(n1);
		//			System.out.println("add in if without braces");
		//		}
		//		else 
		//			System.out.println(n2);
		//		System.out.println("print this");

		int x=1, y=2;
		//1 
//		System.out.println("****** 1 ***********");
//		if(x==1)
//			if(x>y)System.out.println(1);
//			else System.out.println(2);
//		System.out.println(3);
//
//		System.out.println("****** 2 ***********");
//		//1
//		if(x==1)
//			if(x>=y)System.out.println(1);
//			else System.out.println(2);
//		System.out.println(3);
//
//		System.out.println("****** 3 ***********");
//		// 3
//		if(x!=1)
//			if(x>=y)System.out.println(1);
//			else System.out.println(2);
//		System.out.println(3);
//
//		System.out.println("****** 4 ***********");
//		// 4
//		if(x!=1) {
//			if(x>=y)System.out.println(1);
//		}
//		else System.out.println(2);
//		System.out.println(3);
		
		
		System.out.println("Choose payment mode: 1, 2, 3");
		int mode = sc.nextInt();
		if(mode == 1)
		{
			System.out.println("credit card info");
		}
		else if(mode ==2)
			System.out.println("debit card");
		else if(mode==3)
			System.out.println("cod");
		
		System.out.println("wait your payment is getting processed");
	}

}
