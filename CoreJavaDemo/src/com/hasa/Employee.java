package com.hasa;

public class Employee {

	private int eid;
	private String name;
	// has a reference to another class
	// has-a relationship
	private Address address;
	// certificate
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, Address address) {
		this.eid = eid;
		this.name = name;
		this.address = address;
	}
	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
