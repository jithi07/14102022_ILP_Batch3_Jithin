package com.experion.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Product 
{

	String customer_id;
	String customer_name;
	ArrayList<Product>accountype=new ArrayList<Product>();
	public Product(String customer_id, String customer_name, ArrayList<Product> accountype) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.accountype = accountype;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public ArrayList<Product> getAccountype() {
		return accountype;
	}
	public void setAccountype(ArrayList<Product> accountype) {
		this.accountype = accountype;
	}
	
	
	
	

	
	

}
