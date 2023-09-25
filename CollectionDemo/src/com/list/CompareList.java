package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareList {

	public static void main(String[] args) {
		List<Integer> nos = new ArrayList<Integer>();
		nos.add(100);
		nos.add(20);
		nos.add(5);
		nos.add(10);
		nos.add(30);
		System.out.println(nos);
		
		Collections.sort(nos);// ascending order
		System.out.println(nos);
		// descending
		//Collections.reverse(nos);
		System.out.println();
//		Collections.sort(nos, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2.compareTo(o1);
//			}
//		});
//		Collections.sort(nos, (Integer o1, Integer o2)->  {
//				// TODO Auto-generated method stub
//				return o2.compareTo(o1);
//			}
//		);
		Collections.sort(nos, (Integer o1, Integer o2)-> o2.compareTo(o1));
		System.out.println(nos);
		
		
		
		
		
	}

}
