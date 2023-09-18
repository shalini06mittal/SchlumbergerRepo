package com.oops;

public class TestCustomerConstructor {

	public static void main(String[] args) {
		CustomerConstructor c1 = new CustomerConstructor();
		c1.display();
		
		CustomerConstructor c2 = new CustomerConstructor("Shalini","sh@g.c",'F');
		c2.display();
	}
}
