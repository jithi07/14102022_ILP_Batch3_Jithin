package com.experion.service;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
public class Service 
{
	
	public void depositCash(Account account,double amount)
	{
		System.out.println("Depositing money over the counter");
		
	}
	
	public void depositCash(Account account,String checkNumber,double amount)
	{
		System.out.println("Depositing money via  cheque");
	}
	
	public void depositCash(Account account,double amount,String upicode)
	{
		System.out.println("Depositing money via online Transfer");
		
	}
	
	



}
