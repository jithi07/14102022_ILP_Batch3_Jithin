package com.experion.entity;

import java.util.Scanner;

public class Product {

	String ProductCode;
	String ProductName;
	String ProductDescription;
	String ProductPrice;
	String openDate;
	String validityDate;
	String expiryDate;
	boolean active;
	
	
	public void inputProductDetails()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Product Code:");
		ProductCode = scanner.nextLine();
		/**System.out.println("Enter The Product Name:");
		ProductName = scanner.nextLine();
		System.out.println("Enter The Product Description:");
		ProductDescription = scanner.nextLine();
		System.out.println("Enter The Product Price:");
		ProductPrice = scanner.nextLine();
		System.out.println("Enter The Product's OpenDate :");
		openDate = scanner.nextLine();
		System.out.println("Enter The Product's validityDate :");
		validityDate = scanner.nextLine();
		System.out.println("Enter The Product's expiryDate :");
		expiryDate = scanner.nextLine();
		System.out.println(" Active (Yes or No)  :");
		active = scanner.nextBoolean();**/
		
	}
	
	
	public void displayProductDetails()
	{
		
		System.out.println("Product Code:");
		System.out.println(ProductCode);
	} 
}
