package com.experion.service;

import com.experion.entity.Address;
import com.experion.entity.Employee;

public class Service {

	public static Employee createEmployee()
	{
		Address address= new Address("trivandrum");
		Employee employee = new Employee("jithin",address);
		return employee;
	}

	public static void displayEmploye(Employee employee) 
	{
		System.out.println("Name:"+employee.getEmployeeName()+"\n"+"  "+"City:"+employee.getAddress().getCity());
	      System.out.println();
		
	}

}
