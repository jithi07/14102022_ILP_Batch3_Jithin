package com.experion.entity;

public  class CustomerDetails extends Bank
{
	public String customerId;
	String customerName;
	
	
	public CustomerDetails(double balance, String customerName) {
		super(balance);
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		CustomerDetails.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

		
	

}
