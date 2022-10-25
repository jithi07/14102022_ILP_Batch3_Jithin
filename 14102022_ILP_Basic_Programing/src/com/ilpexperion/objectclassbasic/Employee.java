package com.ilpexperion.objectclassbasic;

public class Employee {

	String name = "Suresh thampi";
	int age = 36;
	char gender = 'M';
	float cgpa = 7.6f;
    
	
	public void displayEmployeeDetails() 
	{
		System.out.println("........Welcome to ILP Program.........");
		System.out.println("Name"+"             "+"Age"+"            "+"Gender"+"          "+"CGPA");
		System.out.println(name + "    " + age + "              " + gender + "              " + cgpa);
	}
	
}
