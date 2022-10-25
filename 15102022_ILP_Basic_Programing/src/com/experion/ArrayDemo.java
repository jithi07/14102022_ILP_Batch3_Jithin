package com.experion;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String ProductName[] = new String[5];
		System.out.println("Enter the products:");
		for(int i=0;i<ProductName.length;i++)
		{
			ProductName[i]=scanner.nextLine();
		}
		System.out.println(" products Are:");
		int j=1;
		for(String productname : ProductName)
		{
			System.out.println(j+". "+productname);
			j++;
		}
		
		
		
	}

}
