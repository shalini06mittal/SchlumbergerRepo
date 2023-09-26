package com.thread;

public class MyThread extends Thread{

	private int start, end;
	
	public MyThread(int start, int end) {
		// TODO Auto-generated constructor stub
		this.start =start;
		this.end = end;
	}
	// task this thread will perform
	@Override
	public void run() {
		System.out.println("In run "+Thread.currentThread().getName());
		for(int i=start;i<=end;i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("In run ends"+Thread.currentThread().getName());
	}
}
