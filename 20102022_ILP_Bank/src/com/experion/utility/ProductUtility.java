package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.CustomerDetails;
import com.experion.service.Service;

public class ProductUtility 
{

	public static void main(String[] args) throws Exception
	{
		
		/*Account account = new Account("Womens savings account","acc19876",10000);
		
		Service service = new Service();
		
		service.depositCash(account, 300000);
		service.depositCash(account, 300000,"949567@upi");
		service.depositCash(account,"chq2356", 300000);*/
		String customerId;
		CustomerDetails product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 1.Create Account\n 2.Manage account\n 3.Exit\n");
		int choice = scanner.nextInt();
		 boolean found = false;  
		 String customerid;
		 String customername;
		 String accountType;

		switch(choice) 
		{
		case 1:
			scanner.nextLine();
			System.out.println("Enter Customer ID:\n"); 
	        customerId = scanner.nextLine();  
                      
                found = Service.search(customerId);  
                if (found) 
                { 
                	System.out.println("Customer Exists");  
                     
                }  
              
		        else if (!found) 
                 {  
                System.out.println("Customer Id not available.Create a new Account");  
                System.out.println("********Accounts Available********");  
                System.out.println("1.Savings Max Account\n,2.Current Account\n,3.Loan Account\n");
                System.out.println("Enter your Choice:\n");
                int Accountchoice = scanner.nextInt();
                 switch(Accountchoice)
                 {
                 
                 case 1:
                	    scanner.nextLine();
                        System.out.println("Enter the Customer id:\n");
                        customerid= scanner.nextLine();
                        System.out.println("Enter the Customer Name:\n");
                        customername=scanner.nextLine();
                        CustomerDetails Customer = new CustomerDetails(customerid,customername,1000);
                        
                        System.out.println("Accounted Created Sucesfully\n");
                        
                        
                 case 2:
                	 System.out.println("customer:\n");
                	 
                	
                	   
                                 
                 }
                 
                
            }  
             
				
		}
			
	}
				
				
				
				
				
				
				
		
		
	}




