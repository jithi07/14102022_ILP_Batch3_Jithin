package com.experion.entity;

public class Customer 
{
	String customername;
	String customercode;
	public Customer(String customername, String customercode) {
		super();
		this.customername = customername;
		this.customercode = customercode;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomercode() {
		return customercode;
	}
	public void setCustomercode(String customercode) {
		this.customercode = customercode;
	}
	@Override
	public String toString() {
		return "Customer [customername=" + customername + ", customercode=" + customercode + "]";
	}
	
	
	

}
