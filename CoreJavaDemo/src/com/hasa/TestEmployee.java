package com.hasa;

public class TestEmployee {

	public static void main(String[] args) {
		Address a1 = new Address("Mum", "India", "123112", "Marine Lines");
		Employee e1 = new Employee(1, "Shalini", a1);

		System.out.println(e1);
	}

}

//class Supplier{
//	private Address address;
//}
//class Certificate
//{
//	id, name, date, score/grade, 
//}