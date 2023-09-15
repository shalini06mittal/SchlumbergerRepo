// comments is the only 1 part that can come before package statement
package com.basic;

/*
 * Structure 
 * 1. package declaration [ only 1 , package names should be in lowercase and for
 * subfolder use . to separate
 * ]
 * 2. imports [ multiple ]
 * 3. class declaration [ public class <classname>{}, classname => should be pascalcase ]
 */
/**
 * Java Docs => documentation
 * developers communication
 * @author Shalini
 */
public class HelloWorld {

	 public static void main(String[] args) {
		/**
		 * 
		 * space(memory) ,time 
		 * 
		 * 
		 * Tokens
		 * 1. Data Types => 
		 * byte 8
		 * char 2 [character => numbers, symbols, alphabets, functional keys], unicode
		 * 
		 * Integer 
		 * short 2
		 * int 4
		 * long 8
		 * 
		 * Decimal values
		 * float  4
		 * double 8
		 * 
		 * boolean => true or false
		 * 
		 * 2. Variables / identifier
		 * 3. Literals
		 * 4. Keywords => special or reserved words foe the java compiler or interpreter
		 * 5. Punctuator
		 * 6. separator
		 * 7. assignment operator
		 */
		 // "" => string
 		System.out.println("hello"); // print line
 		System.out.print("welcome"); // print will print the text and keep the cursor on the same line
 		System.out.println("bye");
 		// Hey, "Let's go out" , \" => escape sequence \n newline \t tab
 		System.out.println("Hey, \"Let's go out\". \nPlease be on time");
	}

}
