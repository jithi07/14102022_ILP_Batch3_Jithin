package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Varibalesscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int age;
		char gender;
		double cgpa;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Name:");
		name=scanner.nextLine();
		System.out.println("Enter the Age:");
		age=scanner.nextInt();
		System.out.println("Enter the Gender:");
		gender=scanner.next().charAt(0);
		System.out.println("Enter the CGPA:");
		cgpa= scanner.nextDouble();
		
		
				
		System.out.println("........Welcome to ILP Program.........");
		System.out.println("Name           Age            Gender          CGPA");
		System.out.println(name + "    " + age + "              " + gender + "              " + cgpa);

	}

}
