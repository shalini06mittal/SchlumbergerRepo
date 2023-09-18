package com.oops;

public class CustomerConstructor {

	private String name;
	private String email;
	private char gender;
	private String city;
	
	// CONSTRUCTORS => to initialize the data members of the class
	/**
	 * 1. they are special methods with the name same as the classname
	 * 2. they DO NOT HAVE A return type not even void
	 * 3. cannot invoke them explicity using '.' operator 
	 * 4. Constructors are automatically invoked as soon as the object of the class is created
	 * 5. purpose is to initialize the data members of the class at the time of object creation
	 */
	// which takes no input/parameters => default constructor
	// if there is no constructor in the class, compiler creates one
	// constructor overloading / method overloading
	public CustomerConstructor() {
		System.out.println("Default Contructor called");
		city = "Mumbai";
	}
	public CustomerConstructor(String n, String e, String c, char g) {
		System.out.println("Parameterized constructor Contructor called");
		name = n;
		email = e;
		city = c;
		gender = g;
	}
	public CustomerConstructor(String n, String e,  char g) {
		System.out.println("Parameterized constructor Contructor called");
		name = n;
		email = e;
		gender = g;
	}
	
	public void display()
	{
		System.out.println(name+" "+email+" "+city);
	}
}
