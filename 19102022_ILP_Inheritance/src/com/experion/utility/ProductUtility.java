package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) {
		
		int userChoice;
		int choice;
		int i=0;
		char mainChoice;
		char c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("********** WELCOME TO HDFC **********");
		ArrayList<Product>productList= new ArrayList<Product>();
			 
		do {
			System.out.println("1.Add Card Product\n2.Add Account PRoducts\n3.Display Product");
			System.out.println("Enter Your Choice: ");
			userChoice=scanner.nextInt();
			switch(userChoice) {
			case 1:
			    productList.add(Service.createProduct("cards"));
			    break;
			case 2:
				productList.add(Service.createProduct("Accounts"));
				break;
			case 3:
				Service.displayProductdetails(productList);
				break;
			default: System.out.println("Invalid Choice!");
			
					
				
			}
			System.out.println("Do You Want To Continue: ");
			mainChoice=scanner.next().charAt(0);
		}while(mainChoice == 'y');
	}

	

}
