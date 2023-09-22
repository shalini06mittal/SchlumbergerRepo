package com.datasource;

import com.entities.Brand;
import com.entities.Product;

public class ProductArrayDatabase {

	// array of objects
	private Product products [] = new Product[5];
	
	public ProductArrayDatabase() {
		Brand b1 = new Brand(1, "Apple");
		Brand b2 = new Brand(3, "Windows");
		products[0] = new Product("P001", "MAC laptop", "New version with more space", 123908, b1);
		products[1] = new Product("P002", "AMC IPAD", "Less space and more work", 45678, b1);
		products[2] = new Product("P003", "MAC AirBook", "light weight", 90000, b1);
		products[3] = new Product("P004", "Windows mouse", "wireless and small", 15000, b2);
		products[4] = new Product("P005", "Windows laptop", "lates OS with high speed processor", 78965, b2);
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
	public Product[] getAllProducts()
	{
		return products;
	}
	public boolean editProduct(Product product)
	{
		for (int i = 0; i < products.length; i++) {
			if(product.getProductId().equals(products[i].getProductId()))
			{
				products[i] = product;
				return true;
			}
		}
		return false;
	}
	
}
