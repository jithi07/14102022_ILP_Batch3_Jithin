package com.experion.entity;

import java.util.ArrayList;

public class Customer 
{
 private String customerName;
 private String customerId;
 
 ArrayList<Account> accountList=new ArrayList<Account>();

public Customer(String customerId, String customerName, ArrayList<Account> productList) 
{
	
	
	this.customerId = customerId;
	this.customerName = customerName;
	this.accountList = productList;
}

public Customer() {
	// TODO Auto-generated constructor stub
}

public String getCustomerName() 
{
	return customerName;
}

public void setCustomerName(String customerName) 
{
	this.customerName = customerName;
}

public String getCustomerId() 
{
	return customerId;
}

public void setCustomerId(String customerId) 
{
	this.customerId = customerId;
}

public ArrayList<Account> getAccountList() 
{
	return accountList;
}

public void setAccountList(ArrayList<Account> accountList) 
{
	this.accountList = accountList;
}
 
 
 
 
}
