package com.basic;

public class TypeConversion {

	public static void main(String[] args) {
		// pure and mixed
		// pure => all values of same type
		// integer => int
		System.out.println(2+3+9/5);// type int
		// impure
		// decimal => double
		System.out.println(2+3.0+9/5);// higher data type
		// 5.0+1
		System.out.println(2+3.0+9.0/5);// higher data type
		System.out.println(2+'a'+" hi ");
		System.out.println(2+"a"+" hi ");
		System.out.println(2+2);//4
		System.out.println('a'+'b');
		System.out.println("Data "+2+4);
		System.out.println("Data "+2+'a');
		System.out.println("Data "+(2+'a'));
		System.out.println(2+2+" aslkj");
		
		short s = 10;
		//implicit
		int x = s;
		// explicit casting
		short d = (short)x;
		
		double s1 = 23.34;
		int d1 = (int)s1;
		System.out.println(d1);
		
		char ch = 'a';
		int a1 = ch; // ascii 97
		a1+=10; // a1 = a1+10, 107
		char cd = (char)a1;
		System.out.println(cd);
	}

}
