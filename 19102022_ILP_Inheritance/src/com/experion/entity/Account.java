package com.experion.entity;

import java.util.ArrayList;

public class Account extends Product {
	private String accountType;
   // private Bankservices bankservice;
	ArrayList<Bankservices>bankservice= new ArrayList<Bankservices>();
	public Account(String productCode, String productName, String productType, String accountType,ArrayList <Bankservices> bankService) {
		super(productCode, productName, productType);
		this.accountType = accountType;
		this.bankservice = bankService;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public ArrayList<Bankservices> getBankservice() {
		return bankservice;
	}

	public void setBankservice(ArrayList<Bankservices> bankservice) {
		this.bankservice = bankservice;
	}

	
	
	

}
