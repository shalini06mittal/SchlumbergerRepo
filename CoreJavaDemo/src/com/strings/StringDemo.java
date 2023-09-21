package com.strings;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String desc = "   hello, There   ";
		System.out.println(desc.length());
		System.out.println("**"+desc+"**");
		System.out.println(desc.toUpperCase());
		System.out.println(desc.toLowerCase());
		System.out.println(desc.charAt(5));
		System.out.println(desc.indexOf(','));
		System.out.println(desc.trim());
		System.out.println("**"+desc.stripLeading()+"**");
		System.out.println("**"+desc.stripTrailing()+"**");
		String email ="shalini.mittal@gmail.co.in";
		System.out.println(email.endsWith("gmail.com"));
		String url = "http://www.techgatha.com";
		System.out.println(url.startsWith("https"));
		
		int dotfi = email.indexOf('.');
		System.out.println("first index "+dotfi);
		
		int dotsi = email.indexOf('.', dotfi);
		System.out.println("second index "+dotsi);
		
		// email => part before @
		int idx = email.indexOf('@');
		System.out.println(email.substring(0, idx));// start =0, stop = index of @
		
		System.out.println(email.substring(idx+1, email.lastIndexOf('.')));
		
		int dotindx = email.indexOf('.', idx);
		System.out.println(email.substring(idx+1, dotindx));
		
		// lexicographically => ascii code, dictionary
		// compareTo returns an int value
		/**
		 * s1 < s2 -ve a-97, A-65 97-65 = 32
		 * s1 > s2 +ve
		 * s1 == s2 0
		 */
		System.out.println("apples".compareTo("Apples"));
		System.out.println("Apples".compareTo("apples"));
		System.out.println("Apples".compareTo("Apples"));
		System.out.println("apples".compareTo("apple"));
		System.out.println("apple".compareTo("apples"));
		System.out.println("Apples".compareTo("Apricot")); // p r
		System.out.println();
	
		String s1 = "hello";
		String s2 = "hello";
		String s3 = s1;
		Scanner sc = new Scanner(System.in);
		String s4 = sc.next();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);

		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		
	}
}
