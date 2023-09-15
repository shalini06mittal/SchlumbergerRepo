package com.basic;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		/**
		 * Operators
		 * 1. Unary => 1 operand ++ -- !(Logical NOT)
		 * 2. Binary => 2 operands 2-2
		 * 	a. Arithmetic => + - * / %
		 * 	b . Relational / comparison => < > <= >= == !=
		 *  c. Logical => & && | ||
		 *  d. Bitwise => &(AND) |(OR)  ^(XOR) [ binary ]
		 * 3. Ternary => 3 operands
		 * 	?:
		 */
		// Unary ++(increment by 1)  -- (decrement by 1)
		int x = 10;
		/**
		 * x = x + 1
		 * m1 = x
		 */
		int m1= ++x; // pre
		System.out.println(m1+ " "+x);
		
		int y = 10;
		/**
		 * m2=y
		 * y=y+1
		 */
		int m2 = y++; // post
		System.out.println(m2+" "+y);
		
		int p=1, q=2;
		int z = p++ * p + q/++p;
		//  z = 1 * 2 + 2/3 = 2 + 0
//		System.out.println(z+" "+p+" "+q);
		//  arithmetic
		int l=10, k = 3;
//		System.out.println("+ "+(l+k));
//		System.out.println("- "+(l-k));
//		System.out.println("* "+(l*k));
//		System.out.println("/ "+(l/k));// quotient
//		System.out.println("* "+(l%k));// remainder
		
		// relational => return true or false and they work on number values
//		System.out.println("< "+(l>k));
//		System.out.println("> "+(l<k));
//		System.out.println("<= "+(l<=10));
//		System.out.println(">= "+(l>=12));// quotient
//		System.out.println("== "+(l==k));
//		System.out.println("!= "+(l!=10));
		
		// logical operators
		/**
		 * & |  
		 * short-circuit && || , performance
		 * return boolean result
		 * work on boolean values
		 * | => payment [ cc, dc, neft, cod, upi...]
		 * & => login ( uname and password ]
		 */
		
		// is 25 divisible by 3 and 5 ? F
		// is 25 divisible by 3 or 5 ? T 
		boolean ans1 = 25 % 3 == 0;
		boolean ans2 = 25 % 5 == 0;
//		System.out.println(ans1 & ans2);
//		System.out.println(ans1 | ans2);
//		
//		System.out.println(25%3==0 & 25%5==0);
		
		/**
		 * & if any condition is false the output is false
		 * | if any condition is true the output is true
		 */
		int d = 10;
		boolean f = d >= 10 && d++ == 11;
		System.out.println(f+" " +d);
		
	
	}

}
