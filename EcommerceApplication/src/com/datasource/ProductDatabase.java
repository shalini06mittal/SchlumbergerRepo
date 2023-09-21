package com.datasource;

import com.entities.Product;

public class ProductDatabase {

	private Product products [] = new Product[5];
	
	public ProductDatabase() {
		// initilize some 5 dummy products in the array
	}
	public Product getProductById(String prodid) {
		// search for a product and return the object
		return null;
	}
	public Product[] getAllProducts()
	{
		return products;
	}
	public boolean editProduct(Product product)
	{
		// logic to update existing product and return true if succesfule else false
		return true;
	}
	
}
