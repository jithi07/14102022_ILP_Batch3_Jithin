package com.experion.entity;

public class Employee 
{
 private String EmployeeName;
 Address address;
public Employee(String employeeName, Address address) {
	
	EmployeeName = employeeName;
	this.address = address;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
 
 
}
