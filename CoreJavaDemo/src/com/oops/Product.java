package com.oops;
// beans/ POJO/ resusable components
/**
 * private attributes
 * constructor => a parameterized then should create default constructor
 * getter/setters
 * toString
 */
public class Product {

	private int pid;
	private String prodname;
	private String desc;
	private double price;
		
	public Product() {
		// id generation
	}

	public Product(int pid, String prodname, String desc, double price) {
		//this();
		this.pid = pid;
		this.prodname = prodname;
		this.desc = desc;
		this.price = price;
	}
	
	// getters => accessor a getter for each property
	public String getDesc()
	{
		return this.desc;
	}
	// setters => modifers
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	// @ => annotation => small piece of information to the compiler or interpreter
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", prodname=" + prodname + ", desc=" + desc + ", price=" + price + "]";
	}
	
}
