package com.statics;

public class  Counter {
/**
 * 1. static is a modifier => instance variables, methods, inner classes
 * 2. CANNOT use on local variables or outer class
 * 3. static members are also called as class variables => global data
 * 4. static members do not require object of the class rather can directly be accessed
 * using classname
 * 5. static methods can directly access other static members but can access
 * non-static members only via objects
 * 6. non-static members can access other static or non-static members directly
 * 7. this keyword is not accessible inside a static method
 * 
 * Purpose
 * 1. keep a track or counter of the niof hits, no of customers purchased
 * 2. global functionality , mathematical functionalities
 */
	private int c; // instance
	private static int s; // static/class
	String name;
	public Counter() {
		c++;
		s++;
	}
	// c1.getC()
	public int getC() {
		System.out.println(name);
		return c;
	}
	// c1.getS() => Counter.getS()
	public static int getS() {
		//static int d;
		//this is not available
		int d;
		//System.out.println(obj.c);
		return s;
	}
	public static void setS(int s)
	{
		
		Counter.s = s;
	}
	
	
}
