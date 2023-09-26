package com.entities;

public class Product {

	private String productId;
	private String prodname;
	private String description;
	private double price;
	private Brand brand;
	/*
	 * create constructors, getter/setters and tostring
	 */
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productId, String prodname, String description, double price, Brand brand) {
		super();
		this.productId = productId;
		this.prodname = prodname;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", prodname=" + prodname + ", description=" + description
				+ ", price=" + price + ", brand=" + brand + "]";
	}
	
	
}
