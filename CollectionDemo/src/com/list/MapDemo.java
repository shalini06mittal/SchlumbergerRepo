package com.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * 1. supports indexing
 * 2. allows duplicates
 * 3. can store data of different type , BUT NOT SUGGESTED
 * 4. size is dynamic
 
 */
public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> transactions  = new HashMap<String, Integer>();
		transactions.put("Shalini", 10);
		transactions.put("Nivedita", 1);
		transactions.put("Sapna", 5);
		System.out.println(transactions.get("Hemant"));
		System.out.println(transactions.put("Hemant", 100));
		transactions.put("Het", 100);
		System.out.println(transactions.put("Hemant", 50));
		System.out.println(transactions);
		System.out.println(transactions.get("Sapna"));
		transactions.forEach((k, v) -> {
			if(k.startsWith("H"))
			System.out.println(k+" : "+v);
		});
		if(!transactions.containsKey("Partha"))
			transactions.put("Partha",0);
		transactions.putIfAbsent("Sapna", 50);
		System.out.println(transactions);
		
		Map<String, Integer> transactions1  = new TreeMap<String, Integer>();
		transactions1.put("Shalini", 10);
		transactions1.put("Nivedita", 1);
		transactions1.put("Sapna", 5);
		transactions1.put("Hemant", 100);
		System.out.println(transactions1);
		
	}

}
