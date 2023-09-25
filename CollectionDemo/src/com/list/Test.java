package com.list;

public class Test {

	public void m1() {
		System.out.println(",m1");
	}
	public void m2() {
		m1();
	}
	// inner class
	
	public static void main(String[] args) {
		Test ob = new  Test();
		ob.m1();
		A a1 = new A();
	}

}

class A{
	
}