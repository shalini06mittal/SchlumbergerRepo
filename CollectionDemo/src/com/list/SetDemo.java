package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
/**
 * 1. does not supports indexing
 * 2. does not allows duplicates
 * 3. can store data of different type , BUT NOT SUGGESTED
 * 4. size is dynamic
 * 5. unordered
 * 6. TreeSet requires data of same type to be able to compare and sort
 */ 
public class SetDemo {

	public static void main(String[] args) {
//		Set numbers = new TreeSet(); // sorts the data and stores
//		System.out.println(numbers.add(10));
//		System.out.println(numbers.add(10));
//		numbers.add(5);
//		numbers.add(30);
//		System.out.println(numbers);
//		System.out.println(numbers.size());
//		numbers.add("hello");
//		numbers.add(true);
//		numbers.add('a');
//		numbers.add(23.34);
//		System.out.println();
//		System.out.println(numbers.size());
//		System.out.println(numbers.remove(10));
//		System.out.println();
//		System.out.println(numbers.size());
//		System.out.println(numbers);
		
		Set<String> cities = new HashSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Chennai");
		cities.add("Aurangabad");
		cities.add("Agra");
		System.out.println(cities);
		Iterator<String> iter = cities.iterator();
		while(iter.hasNext())
		{
			String city = iter.next();
			if(city.startsWith("A"))
				System.out.println(city);
		}
		
		Set<String> cities1 = new TreeSet<String>();
		cities1.add("Mumbai");
		cities1.add("Pune");
		cities1.add("Chennai");
		cities1.add("Aurangabad");
		cities1.add("Agra");
		System.out.println(cities1);
		System.out.println();
		Consumer<String> consumer = new ConsumerImpl();
		
		cities1.forEach(consumer);
		
	}
}
// consumer => consumes data of any type
class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t.toUpperCase());
		
	}
	
}
