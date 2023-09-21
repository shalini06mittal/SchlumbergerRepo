package com.oops;

public class TestProduct {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "bread", "fresh from bakery", 45);
		p1.setDesc("Freshly baked from the Bakery!!");
		//System.out.println(p1.display());
		int s = 10;
		System.out.println(s);// 10
		// string representation of p1 object
		// toString is an implicit call
		System.out.println(p1);// product information
	}

}
