package com.oops;

import java.util.Scanner;

public class TestCustomer {

	// static methods can be directly called from other static methods
	public static Customer input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		
		String name = sc.next();
		String city = sc.next();
		String email = sc.next();
		char gender = sc.next().charAt(0);
		Customer customer = new Customer();
		customer.setData(name, email, city , gender);
		return customer;
	}

	public static void main(String[] args) {
		System.out.println("Enter data for customer 1");
		Customer c1 = input();
		System.out.println("Enter data for customer 2");
		Customer c2 = input();
//		c1.display();
//		c2.display();
		// send to database
		System.out.println(c1.display());
		String s = c2.display();
		System.out.println(s);
		
		
	}
	// UI => console, desktop, web , mobile, appn
//	public static void main(String[] args) {
//		// c1 => 
//		// 4 bytes
//		int x =0;//int data type , x variable of type int
//		System.out.println(x);//?
//		//c1=> reference variable of type Customer , Customer => user defined data type
//		// object of the class Customer
//		Scanner sc = new Scanner(System.in);
//		Customer c1 =new Customer(); // [] => array syntax
//		
//		
//		c1.setData(name,"shalini@gmail.com","Mum",'F');// caller
////		c1.name="Shalini";
////		c1.email ="shalini@gmail.com";
////		c1.gender='F';
////		c1.city ="Mumbai";
//		System.out.println(c1);
//		// c2 => 
//		Customer c2;
//		c2 = new Customer();
//		name = sc.next();
//		
//		c2.setData(name,"ram@gmail.com",'M');
////		c2.name="Ramesh";
////		c2.email ="ramesh@gmail.com";
////		c2.gender='M';
////		c2.city ="Delhi";
//		System.out.println(c2);
////		System.out.println("Name :"+c1.name+"\nCity"+c1.city+" "+c1.email+" "+c1.gender);// Ms
////		System.out.println(c2.name+" "+c2.city+" "+c2.email+" "+c2.gender);
//		c1.display();
//		c2.display();
//		
//	}

}
