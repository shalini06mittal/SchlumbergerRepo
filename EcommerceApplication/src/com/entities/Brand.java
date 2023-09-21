package com.entities;

public class Brand {

	private int brandid;
	private String brandname;
	public Brand() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * create constructors, getter/setters and tostring
	 */
	public Brand(int brandid, String brandname) {
		super();
		this.brandid = brandid;
		this.brandname = brandname;
	}
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	@Override
	public String toString() {
		return "Brand [brandid=" + brandid + ", brandname=" + brandname + "]";
	}
	
}
