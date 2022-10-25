package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.Bankservices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service 
{
	public static Product createProduct(String productType) 
	{
		//Card card = new Card("product100","Master card ","cards","master");
		//return card;
		ArrayList<Bankservices> bankService = new ArrayList<Bankservices>();
		bankService.add(new Bankservices("s0b102","online banking"));
		bankService.add(new Bankservices("s0b103","mobile banking"));
		bankService.add(new Bankservices("s0b104","card banking"));
		Product product=null;
		if(productType.compareTo("cards")== 0)
		{
		 product = new Card("product100","Master card ","cards","master");
		}
		else if(productType.compareTo("Accounts")== 0)
		{
		 product = new Account("product201","Womens Savings Account ","Accounts","Savings",bankService);
		}
			
		return product;
	}

	

	

	public static void displayProductdetails(ArrayList<Product> productList) 
	{
		Card card = null;
		Account account = null;
		System.out.println("product code" + "	"+"product name"+"	 "+"product type"+"Account/card"+"	"+"Services");
		for(Product product : productList)
		{
			
			if(product instanceof Card)
			{
				card = (Card)product;
				System.out.println(card.getProductCode()+"		"+card.getProductName()+"		"+card.getProductType()+"		"+card.getCardType());
			}
			else if(product instanceof Account)
			{
				account = (Account)product;
				System.out.println(account.getProductCode()+"		"+account.getProductName()+"		"+account.getProductType()+"		"+account.getAccountType()+"		");
				
				System.out.println("Services Are :");
				for(Bankservices  bankService: account.getBankservice())
				{
					System.out.println(bankService.getServiceName());
				}
			
			}
		
			
			
			//System.out.println("Invalid ");
		}
	}

}
