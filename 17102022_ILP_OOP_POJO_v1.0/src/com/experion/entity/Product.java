package com.experion.entity;

public class Product {

	private String productCode;
	private String productName;
	private String productDescription;
	private double productPrice;
	private String opendate;
	private String validdate;
	private String expirydate;
	private boolean active;
	
	
	
	
	public Product(String productCode,String productName,String productDescription,double productPrice,String openDate,String validityDate,String expiryDate)
	  {
		 this.productCode=productCode;
		 this.productName=productName;
		 this.productDescription=productDescription;
		 this.productPrice=productPrice;
		 this.opendate=openDate;
		 this.validdate=validityDate;
		 this.expirydate=expiryDate;
		
		 
		 
		 
	  }
	
	
	
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getOpendate() {
		return opendate;
	}
	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}
	public String getValiddate() {
		return validdate;
	}
	public void setValiddate(String validdate) {
		this.validdate = validdate;
	}
	public String getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

	

}
