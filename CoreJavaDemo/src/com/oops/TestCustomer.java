package com.oops;

import java.util.Scanner;

public class TestCustomer {

	// static methods can be directly called from other static methods
	// input()
	//input()
	// to create new customers with their data
	public static Customer input() {
		// form on the webpage
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();//het
		System.out.println("enter city");
		String city = sc.next();
		System.out.println("enter email");
		String email = sc.next();
		System.out.println("enter gender");
		char gender = sc.next().charAt(0);
		Customer customer = new Customer();
		//customer.name = name;
		customer.setData(name, email , gender);
		return customer;
	}

//	public static void display(Customer customer)
//	{
//		System.out.println("********************************************************");
//		System.out.println("Name : "+customer.name+"\nCity : "+customer.city+"\nEmail : "+customer.email+"\nGender : "+customer.gender);
//		System.out.println("********************************************************\n");
//	}
	public static void main(String[] args) {
		System.out.println("Enter data for customer 1");
		Customer c1 = input(); // creates customer 1
		System.out.println(c1);
		System.out.println("Enter data for customer 2");
		Customer c2 = input();// creates customer 2
		
//		display(c2);
//		
//		display(c1);
		System.out.println(c1.display());
		System.out.println(c2.display());
		//c1.name="Sheetal";
		c1.setName("Sheetal");
		System.out.println(c1.display());
		//display(c1);
		
//		c1.display();
//		c2.display();
		// send to database
//		System.out.println(c1.display());
//		String s = c2.display();
//		System.out.println(s);
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
