package com.client;

import java.util.Scanner;

import com.datasource.ProductDatabase;
import com.entities.Product;

public class MainEntry {

	public static void displayMenu()
	{
		System.out.println("1. view All products");
		System.out.println("2. Update Product");
		System.out.println("3. Get Product");
		System.out.println("4. Purchase Product");
		System.out.println("5. Find Product By Brands");	
	}
	public static void main(String[] args) {
		/*
		 * A. create object of ProductDatabase
		 * B. Write a menu driven program that displays menu as follows:
		 * 	1. View all products 
		 * 		Display all products in tabular format
		 * 	2. update product
		 * 	Ask the user to enter product details to update the product
		 * 	3. Get product by id
		 * 	Ask the user to enter  id and display the product
		 * 	4. Purchase products
		 * 	Ask the user which product to purchase and continue asking
		 * 	until user says no. Then display the total amount to pay 
		 * 	5. Display all products by brands
		 * 		ask the user to enter the brand and display all the products by brand 
		 */
		ProductDatabase database = new ProductDatabase();
		Scanner sc = new Scanner(System.in);
		Product products[];
		System.out.println("Choose one of the option:-");
		displayMenu();
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			products = database.getAllProducts();
			System.out.println(products.length);
			if(products.length>0) {
				System.out.println("SNO\tName\t\tPrice\t\tBrand\t\tDescription");
				for (Product product:products) {
					System.out.print(product.getProductId()+"\t");
					System.out.print(product.getProdname()+"\t");
					System.out.print(product.getPrice()+"\t");
					System.out.print(product.getBrand().getBrandname()+"\t\t");
					System.out.print(product.getDescription()+"\t");
					System.out.println();
				}
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
			
		}
		

	}

}
