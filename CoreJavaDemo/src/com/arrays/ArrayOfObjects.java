package com.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		int x[]= new int[5];
		String fruits []= new String[5];
		//System.out.println(fruits[1]);
		//System.out.println(fruits[1].toUpperCase());

		// create an array to store 3 students data
		Student students[]= new Student[3];
		System.out.println(students[0]);
		
		Student s1 = new Student(1, "Shalini");
		students[0] = s1;
		students[1] = new Student(2, "Sapna");
		students[2] = new Student(3, "Hemant");
		
		for (int i = 0; i < students.length; i++) {
			Student obj = students[i];
			System.out.println(obj);
			System.out.println(obj.getName());
		}
		
		// for each loop=> to iterate over collection of items
		int arr[] = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			int data = arr[i];
			System.out.println(data*data);
		}
		/*
		 * 1.  convenience
		 * 2. used only to iterate in forward direction and to access
		 * 2. CANNOT MODIFY THE DATA IN for-each loop
		 */
		System.out.println();
		for(int data : arr)
		{
			System.out.println(data*data*data);
		}
		for(Student student : students)
			System.out.println(student);
		
		s1 = new Student(1, "Shalini Mittal");
		for(int i = 0; i < students.length; i++) {
			Student student = students[i];
			if(student.getRno() == s1.getRno()) {
				System.out.println("found");
				students[i] = s1;
				break;
			}
		}
		System.out.println(students[0]);
		
		
	}

}
