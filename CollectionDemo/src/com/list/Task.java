package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Shalini","Manisha","Sajat", 
				"Manisha", "Hemant","Shalini","Manisha", "Sapna", "Manisha");

		//		Set<String> set = new TreeSet<String>();
		//		set.addAll(names);
		//		System.out.println(set);
		//		System.out.println(set.size());
		//		int count[]= new int[set.size()];
		/**
		 * Map
		 * Shalini : 2
		 * Manisha : 4
		 * sajat : 1
		 * Hemant: 1
		 * Sapna : 1
		 */
		Collections.sort(names);
		//names.forEach(name->System.out.println(name));
		/**
		 * Hemant
			Manisha
			Manisha
			Manisha
			Manisha
			Sajat
			Sapna
			Shalini
			Shalini
		 */

		Map<String, Integer> map = new HashMap<String, Integer>();

		for(int i=0;i<names.size()-1;i++) {
			String name = names.get(i);
			String sn = names.get(i+1);
			System.out.println(name+" "+sn);
			if(name.equals(sn) && map.get(name) != null)
				map.put(name, map.get(name)+1);	
			else
				map.put(sn, 1);

			System.out.println(map);
			System.out.println();
		}


		//		names.forEach(name->{
		//			if(map.get(name) == null)
		//				map.put(name , 1);
		//			else
		//			{
		//				int count = map.get(name);
		//				count++;
		//				map.put(name, count);
		//			}
		//		});
		//		System.out.println();
		//		System.out.println(map);
		System.out.println();
		System.out.println(map);
	}

}
