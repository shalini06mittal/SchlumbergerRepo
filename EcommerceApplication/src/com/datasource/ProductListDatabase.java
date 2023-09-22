package com.datasource;

import java.util.ArrayList;
import java.util.List;

import com.entities.Brand;
import com.entities.Product;

public class ProductListDatabase {

	// array of objects
	private List<Product> products = new ArrayList<Product>();
	
	public ProductListDatabase() {
		Brand b1 = new Brand(1, "Apple");
		Brand b2 = new Brand(3, "Windows");
		products.add(new Product("P001", "MAC laptop", "New version with more space", 123908, b1));
		products.add(new Product("P002", "AMC IPAD", "Less space and more work", 45678, b1));
		products.add(new Product("P003", "MAC AirBook", "light weight", 90000, b1));
		products.add(new Product("P004", "Windows mouse", "wireless and small", 15000, b2));
		products.add( new Product("P005", "Windows laptop", "lates OS with high speed processor", 78965, b2));
	}
	public Product getProductById(String prodid) {
		// search for a product and return the object
		// 
		for(Product p : products)
		{
			if(p.getProductId().equals(prodid))
				return p;
		}
		return null;
	}
	public List<Product> getAllProducts()
	{
		return products;
	}
	public boolean editProduct(Product product)
	{
		for (int i = 0; i < products.size(); i++) {
			if(product.getProductId().equals(products.get(i).getProductId()))
			{
				products.set(i, product);
				return true;
			}
		}
		return false;
	}
	
}
