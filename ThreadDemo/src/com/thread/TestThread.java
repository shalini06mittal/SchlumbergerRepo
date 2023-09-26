package com.thread;

public class TestThread {

	public static void main(String[] args) {
		System.out.println("main starts " +Thread.currentThread().getName());
		MyThread t1 = new MyThread(1,5);
		t1.setName("T1");
		MyThread t2 = new MyThread(100, 105);
		t2.setName("T2");
		//t1.run(); // this is a normal call
		t1.start();
		t2.start();
		
		System.out.println("main ends");
		for(int i=1;i<=1000;i++)
		{
			System.out.println(i*i);
		}
		System.out.println("askdljakjlda");
		

	}

}
