package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	
	
	

	
	
	 public static Product inputProductDetails()
	    {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println(" Enter The Product Code:");
			String productCode = scanner.nextLine();
			
			
			System.out.println(" Enter The Product Name:");
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
			
			
		

			 Product product = new Product(productCode,productName,productDescription,productPrice,openDate,expiryDate,validityDate);
	    }
	    
	    public void displayProductDetails(Product product)
	    {
	    	System.out.println("Product Name " + "		" + "Product Description" + "		" + "Product Price"
					+ "			" + "Open Date" + "		" + "Expiry Date");
			System.out.println(product.getProductName() + "				" + product.getProductDescription() + "				" + product.getProductPrice()
					+ "		" + product.getOpendate() + "		" + product.getExpirydate());


	    }

}
