package com.experion.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	public static Product createProduct()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Proudct Code - ");
		String productCode = scanner.nextLine();
		System.out.println("Enter Product Name - ");
		String productName = scanner.nextLine();
		System.out.println("Enter Product Description - ");
		String productDescription = scanner.nextLine();
		System.out.println("Enter Product Price - ");
		double productPrice = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Enter Product Open Date - ");
		String openDate = scanner.nextLine();
		System.out.println("Enter Product Valdity Date - ");
		String validityDate = scanner.nextLine();
		System.out.println("Enter Product Expiry Date - ");
		String expiryDate = scanner.nextLine();
		System.out.println("Active (true or false) - ");
		boolean active = scanner.nextBoolean();
		
		Product product=new Product(productCode,productName,productDescription,productPrice,openDate,validityDate,expiryDate,active);
		product.setSerialNo(product.getSerialNo()+1);
		product.setSerialNoog(product.getSerialNo());
		return product;

	
	}
	
	public static void displayProductDetails(ArrayList<Product> productList) {
		
		
		System.out.println("Product Serail Number " + "		" +"Product code " + "		" +"Product name " + "		" +"Product Description " + "		" +"Product price " + "		" +"Product Opendate " + "		" + "Product Validity" + "		" + "Product Expiry");
		for(Product product:productList)
		{
			if(product!=null)
		System.out.println(product.getSerialNoog() + "				" +product.getProductCode() + "				" +product.getProductName() + "				" +product.getProductDescription() + "				" +product.getProductPrice() + "				" +product.getOpenDate() + "				" +product.getValidityDate() + "				" + product.getExpiryDate());
		}
	}
		

}
