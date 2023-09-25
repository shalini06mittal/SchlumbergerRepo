package com.list;

public class Employee implements Comparable<Employee>{

	private int eid;
	private String name;
	private String city;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, String city) {
		super();
		this.eid = eid;
		this.name = name;
		this.city = city;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return eid - o.eid;
		return name.compareTo(o.name);
	}
	
}
