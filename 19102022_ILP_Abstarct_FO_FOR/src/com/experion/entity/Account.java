package com.experion.entity;

import com.experion.service.CardAccountService;

public class Account extends Product implements CardAccountService
{
	private String accountNumber;
	private double accountBalance;
	public Account(String productName,String accountNumber, double accountBalance)
	{
		super(productName);
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public void checkProductValidity() {
		// TODO Auto-generated method stub
		System.out.println("validity check for Account class called");
	}
	@Override
	public void checkBalance() 
	{
		System.out.println("Account Balance is :30000000");
		
	}
	@Override
	public void cashWithdrawal() 
	{
		System.out.println("Amount Withdrawed from Account:2000");

	}
	
	
	

	
	
	

}
