package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Product;

public class BankUtility 
{
	// TODO Auto-generated method stub
	public static void main(String[] args)throws Exception {
			 int userChoice;
				int choice;
				int i=0;
				char mainChoice;
				char c;
				String customer_id;
				Scanner scanner=new Scanner(System.in);
				System.out.println("**********WELCOME TO BANK**********");
				ArrayList<Product>accountList=new ArrayList<Product>();
		
				do 
					{
					System.out.println("1.Create Account\n2.Manage Account\n3.Exit");
					userChoice=scanner.nextInt();
						
							switch(userChoice) 
							{
							case 1:	
								     System.out.println("Enter your Customer Id:\n");
								     customer_id=scanner.nextLine();
								     if(customer_id!=accountList.getCustomer_id())
								     {
								    	 System.out.println("No Customer Available:");
								    	 
								    	 
								     }
								
								
							}
					}while(userChoice==3);
	}
}

				


				