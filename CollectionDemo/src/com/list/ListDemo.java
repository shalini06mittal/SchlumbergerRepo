package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 1. supports indexing
 * 2. allows duplicates
 * 3. can store data of different type , BUT NOT SUGGESTED
 * 4. size is dynamic
 *	
 *Wrapper classes
 *byte		Byte
 *char		Character
 *short		Short
 *int 		Integer
 *long		Long
 *float		Float
 *double	Double
 *boolean	Boolean
 */
public class ListDemo {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		numbers.add(10);
		numbers.add(10);
		numbers.add(30);
		System.out.println(numbers.size());
		numbers.add("hello");
		numbers.add(true);
		numbers.add('a');
		numbers.add(23.34);
		System.out.println(numbers.size());
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(4));
		System.out.println(numbers.remove(4));
		System.out.println(numbers.size());
		System.out.println(numbers);
		for(int i=1;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		int x[] = {1,2,3,4,5};
		for(int v:x)
			System.out.println(v);
		// for each
		int sum = 0;
		
//		for(Object v:numbers) {
//			if(v instanceof Number) {
//				System.out.println(v);
//				Integer ob = (Integer)v;
//				sum+=ob.intValue();
//			}
//		}
//		System.out.println(sum);

		// generics  => type safety
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(10);
		nos.add(20);
		nos.add(10);
		nos.add(30);
		//nos.add(10.34);
		sum = 0;
		for(Integer ob: nos)
		{
			sum+= ob;
		}
		System.out.println(sum);
		List<String> fruits = new ArrayList<String>();
		fruits.add("apples");
		fruits.add("oranges");
		fruits.add("banana");
		fruits.add(2, "watermelon");
		
		System.out.println(fruits);
		fruits.set(1, "mangoes");
		System.out.println(fruits);
	}

}
