package com.experion.entity;

import com.experion.service.CardAccountService;

public class Card extends Product implements CardAccountService
{
	private String cardNumber;
	private double cardBalance;
	public Card(String productName,String cardNumber, double cardBalance)
	{
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardtNumber) {
		this.cardNumber = cardtNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	
	@Override   //annotation
	public  void checkProductValidity()
	{
		System.out.println("validity check for card class called");
	}
	@Override
	public void checkBalance() 
	{
		
		System.out.println("card balance: 28790000 ");
	}
	@Override
	public void cashWithdrawal() 
	{
		
		System.out.println("Amount Withdrawed From Card :30000");
		
	}
	
		
	
	

	
	
	

}
