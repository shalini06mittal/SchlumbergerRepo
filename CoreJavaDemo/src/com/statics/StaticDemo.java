package com.statics;

public class StaticDemo {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		Counter c5 = new Counter();
		System.out.println(c1.getC());//
		System.out.println(c2.getC());//
		System.out.println(c3.getC());//
		System.out.println(c4.getC());//
		System.out.println(c5.getC());//
		System.out.println();
		System.out.println(Counter.getS());//
		System.out.println(c3.getS());//
		System.out.println();
		Counter.setS(100);
		System.out.println(c1.getS());
		new Demo().changeData(50);
		System.out.println(c1.getS());
	}

}
