package com.oops;

import java.util.Scanner;

/**
 * template / blueprint
 * user defined data type
 * composite data type => class is composed of diff types of data
 * @author Shalini
 *
 *entities that you identify play a role in that system
 *Product => id, iremanme, price, desc, imageurl
 *Car => carno, color, amke, model, regn0, insurance..
 *
 *
 *Employee
 *payroll
 *
 *Doctor
 *Patient
 *Nurse
 *
 *nouns
 *can create n no of customer with diff information  
 */
public class Customer {
	// attributes or characteristics data members, adjectives
	// instance variables
	String name;
	String email;
	char gender;
	String city;
	/**
	 * <access specifier>  <return type> <methodname>(){
	 * 	//body
	 * // BL this method will perform
	 * 
	 * }
	 * reusable block of code
	 * void => returns nothing
	 * 1. input data to work upon => parameters to the method
	 * 2. body => BL
	 * 3. output => return keyword
	 * method are verbs
	 */
	//c1
//	void setData()
//	{
//		// Console based application
//		// tightly and loosely coupled
//		Scanner sc = new Scanner(System.in);
//		name = sc.next();
//	}
	void setData(String nm, String em, String c, char g)
	// methods => 
	{
		email =em;
		gender=g;
		city =c;
		if(gender=='M')
			name="Mr "+nm;
		else
			name="Ms "+nm;
	}
	// signature
	void setData(String nm, String em, char g)
	// methods => 
	{
		email =em;
		gender=g;
		city ="N/A";
		if(gender=='M')
			name="Mr "+nm;
		else
			name="Ms "+nm;
	}
//	void display()
//	{
//		System.out.println("********************************************************");
//		System.out.println("Name : "+name+"\nCity : "+city+"\nEmail : "+email+"\nGender : "+gender);
//		System.out.println("********************************************************\n");
//	}
	public String display()
	{
		String str = "********************************************************\n";
		str += "Name : "+name+"\nCity : "+city+"\nEmail : "+email+"\nGender : "+gender;
		str+="********************************************************\n";
		return str;
	}
}
