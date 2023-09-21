package com.arrays;

public class Student {

	private int rno;
	private String name;
	
	public Student() {
		System.out.println("1");
	}

	public Student(int rno, String name) {
		System.out.println(2);
		this.rno = rno;
		this.name = name;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	
}
