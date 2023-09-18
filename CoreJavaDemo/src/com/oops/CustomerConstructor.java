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
	// local variables
	/**
	 * this keyword => represents the current object
	 * 
	 */
	public CustomerConstructor(String name, String email, String city, char gender) {
		// this is of type Customer
		// Customer this = c2 , c3
		System.out.println(this);
		System.out.println("Parameterized constructor Contructor called");
		this.name = name;
		this.email = email;
		this.city = city;
		this.gender = gender;
	}
	//c2
	public CustomerConstructor(String n, String e, char g) {
		this(); // calling a constructor that takes no parameters
		System.out.println("Parameterized constructor Contructor called");
		name = n;
		email = e;
		gender = g;
		this.setSalutation();
	}
	private void setSalutation()
	{
		if(this.gender=='M')
			this.name="Mr "+name;
		else
			name="Ms "+name;
	}
	
	public void display()
	{
		// this => current object 
		// this is implicit
		System.out.println(this.name+" "+email+" "+city);
	}
}
