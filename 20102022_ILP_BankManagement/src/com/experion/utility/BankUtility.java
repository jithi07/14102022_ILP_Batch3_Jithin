package com.experion.utility;

import java.util.ArrayList;
import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Customer;
import com.experion.entity.Product;
import com.experion.entity.Service;
import com.experion.service.BankServices;

public class BankUtility 
{

	public static void main(String[] args) 
	{
		    String UChoice;
		    String customerId;
		    Scanner scanner=new Scanner(System.in);
			ArrayList<Product> productList = new ArrayList<Product>();
			ArrayList<Service> allServicesList = new ArrayList<Service>();
			ArrayList<Account> accountList = new ArrayList<Account>();
			
		    Customer customer = null;
		    allServicesList=BankServices.createService();
		    productList=BankServices.createProducts(allServicesList);
			
			
		   do
			{
			System.out.println(" 1.Create Account\n 2.Manage account\n 3.Display Accounts\n 4.Exit\n");
			System.out.println("Enter your Choice:\n");
			int choice = scanner.nextInt();
			switch(choice) 
			{
			case 1:
				
				if(customer == null) 
				{
				 
				 System.out.println("****Account Creation****\n");
				 
				/* System.out.println("1.Savings Max Account");
		         System.out.println("2.Current Account");
		         System.out.println("3.Loan Account");
		         System.out.println("Enter your choice");
		         choice = scanner.nextInt();
		         scanner.nextLine();*/

			     productList=BankServices.createProducts(allServicesList);
            	 customer= BankServices.createCustomer(productList);
            	 break;
				}
            	 else
            	 {
            		 System.out.println("Customer Exists"); 
            	 }
				  	                	    
	                	
	         case 2:
	        	 System.out.println("****Account Management****\n");
	        	 scanner.nextLine();
	        	 if(customer!=null)
                      BankServices.manageAccounts(customer);
	        	 else
	        		 System.out.println("NO Customer Exists"); 
              
             case 3:
            	      System.out.println("****Account Details****");
           	           BankServices.displayCustomer(customer);
	              
	       			
	}        
			scanner.nextLine();
			 System.out.println("Do you want to continue: press y");
			 UChoice=scanner.nextLine();
			}while(UChoice.compareTo("Y")==0||UChoice.compareTo("y")==0);

	}
}



