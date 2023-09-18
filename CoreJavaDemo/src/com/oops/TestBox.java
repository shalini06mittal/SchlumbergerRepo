package com.oops;

public class TestBox {

	public static void main(String[] args) {
		Box b1 = new Box();
		b1.initialize(2, 2, 2);
		Box b2 = new Box();
		b2.initialize(3, 4, 5);
		b1.display();
		System.out.println(b1.volume());
		b2.display();
		System.out.println(b2.volume());
	}
}
