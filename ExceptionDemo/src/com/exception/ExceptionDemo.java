package com.exception;

import java.io.FileWriter;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nos");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		/**
		 * try, catch, finally, throw and throws
		 * 1. try cannot exist alone
		 * 2. try is followed by atleast a catch or a finally block
		 * 3. catch and finally, then finally has to be the last block and only 1 block
		 * 4. There can be multiple catch
		 * 5. Can have nested try catch
		 * 6. try=> that executes the code that may throw an exception
		 * 7. catch => that handles the exception thrown by the immediate try block
		 * 8. If there are more than 1 catch then the catch with the most generic exception
		 * should be in the last
		 * 9. finally => used to execute code irrespective if the try block throws an exception
		 * or not. Used to release the resources that may have opened in the try block
		 */
		System.out.println("Add " +(n1+n2));
		try {
			System.out.println("Div "+n1/n2);
		}
		catch(ArithmeticException e) {
			System.out.println("Den cannot be 0");
		}
		finally {
			System.out.println("finally");
		}
		
		String s[] = new String[5];
		s[1]= "Shalini";
		try {
			//System.out.println(s[5]);// ArrayIndexOutOfBound
			System.out.println(s[0].toUpperCase());// NullPointer
			System.out.println(s[1].charAt(10));//StringIndexOutOfBound
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}catch(NullPointerException e)
		{
			System.out.println("Array is null");
		}
		catch(Exception e)
		{
			System.out.println("something went wrong");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}

		System.out.println("Sub "+ (n1-n2));
		System.out.println("BYREEE MAIN ENDS");
		// checked exception
		//FileWriter writer = new FileWriter("test.txt");

	}

}
