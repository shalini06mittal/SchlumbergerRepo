package com.loops;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		
		// print square of numbers 1 to 5
		// repeat => loops
		// for, while and do-while
		// while =>  keep printing squares till the condition is true
		int n = 1; // start
		
		while(n < 6) // n=6 // stop condition
		{
			System.out.println(n*n); //1
			n++;// update, step//2
		}
		
		Scanner sc = new Scanner(System.in);
		//int i = 1;
		int sum = 0;
//		while(i<=5) {
//			System.out.println("enter amt "+i);
//			int n1 = sc.nextInt();//20, 30, 40, 50, 60
//			sum = sum + n1; // 20 + 30 = 20
//			++i;
//		}
//		System.out.println(sum);
		// find power of base to number base = 2, power = 3
		// 2^3 = 8
		
		int value = 1;
		int base = 2, power = 5;
//		while (i<=power) {
//			value = base * value;
//			i++;
//		}
		for(int i=1; i<=power;i++)
			value *= base;
		System.out.println(value);
		
		// for loop => start, stop, step
		// for loop when we know how many times to run something
		for(int y=1;y<=5;y++)
		{
			System.out.println(y+" : "+y*y*y);
		}
		// take a no as input and i need to count the number of times it is divisible by 2
		// 20 => 1, 10=> 2, 5
		// 24 => 1, 12=> 2, 6=> 3, 3
		//System.out.println("enter a no");
		//int no = sc.nextInt(); // 20
//		int c= 0;
//		while(no % 2==0) // unfixed iterations
//		{
//			c++;
//			no= no/2;//5
//		}
//		System.out.println(c);
//		int c= 0;
//		for (; no%2==0; no/=2) // fixed iterations
//			c++;
//		System.out.println(c);
//		
		int s = 0; // start, we want to execute atleast once
		do {
			System.out.println(s*s);
			s++; // step
		}while(s<=5);
		
		int d = 1;
		while(d<1) {
			System.out.println(1);
			d++;
		}
		
		/**
		 * ask the user to enter a no. It should be a 2-digit number.
		 * If not keep asking the user to enter a 2-digit number .
		 * Once user enters a 2-digit number,
		 * print if both the digits are same or not 
		 */
		int num =0;
		
		do {
			System.out.println("enter a 2-digit number please!!");
			 num = sc.nextInt();
		}while(num < 10 || num > 99);
		
		System.out.println(num % 11==0? "Same digits":"Diff digits");
		d=1;
		do {
			System.out.println('*');
			d++;
		}while(d<1);
		
	}

}
