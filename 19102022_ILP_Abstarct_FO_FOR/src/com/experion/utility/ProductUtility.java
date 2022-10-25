package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class ProductUtility 
{

	public static void main(String[] args) 
	{
		
		/*Account account = new Account("Womens savings account","acc19876",10000);
		
		Service service = new Service();
		
		service.depositCash(account, 300000);
		service.depositCash(account, 300000,"949567@upi");
		service.depositCash(account,"chq2356", 300000);*/
		
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account 2.CArd 3.Loan");
		int choice = scanner.nextInt();
		
		if(choice == 1)
		{
			product = new Account("womens Savings Account","ACC2456",10000);
			Account account = (Account)product;
			account.cashWithdrawal();
			account.checkBalance();
			
		}
		
		else if(choice == 2)
		{
			product = new Card("Master card","Card2456",10000);
			Card card = (Card)product;
			card.cashWithdrawal();
			card.checkBalance();
		}
		
		if(choice == 3)
		{
			product = new Loan("Home Loan","HMln2456",1000000);
			Loan loan = (Loan)product;
			loan.checkDueDate();
			loan.loanApproval();
			
		}

     product.checkProductValidity();
		
	
		
		
	}

}
