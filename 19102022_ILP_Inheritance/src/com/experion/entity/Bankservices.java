package com.experion.entity;

public class Bankservices 
{
private String servicecode;
private String serviceName;
public Bankservices(String servicecode, String serviceName) {
	
	this.servicecode = servicecode;
	this.serviceName = serviceName;
}
public String getServicecode() {
	return servicecode;
}
public void setServicecode(String servicecode) {
	this.servicecode = servicecode;
}
public String getServiceName() {
	return serviceName;
}
public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
}



	
}
