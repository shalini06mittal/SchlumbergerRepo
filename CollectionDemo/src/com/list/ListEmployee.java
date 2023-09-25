package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmployee {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(1, "Shalini", "Mumbai"));
		
		emps.add(new Employee(3, "Manish", "Pune"));
		emps.add(new Employee(2, "Riya", "Delhi"));
		emps.add(new Employee(5, "Sejal", "Bhopal"));
		emps.add(new Employee(4, "Asha", "Pune"));
		emps.add(new Employee(6, "Sunil", "Mumbai"));
		
		//System.out.println(emps);
		emps.forEach(emp -> System.out.println(emp));

		// display emp data on id => 
		Collections.sort(emps);// employee obbject is not comparable
		System.out.println();
		emps.forEach(emp -> System.out.println(emp));
		
		Collections.sort(emps, 
				(o1, o2)-> o1.getCity().compareTo(o2.getCity()));// employee obbject is not comparable
		System.out.println();
		emps.forEach(emp -> System.out.println(emp));
		
		
	}

}
