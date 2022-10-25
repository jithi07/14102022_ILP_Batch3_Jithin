package com.experion;

import java.util.Scanner;

public class Advancefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String ProductName[] = new String[5];
		System.out.println("Enter the products:");
		for(int i=0;i<5;i++)
		{
			ProductName[i]=scanner.nextLine();
		}
		System.out.println(" products Are:");
		int j=1;
		for(int i=0;i<5;i++)
		{
			
			
			System.out.println(j+"."+ProductName[i] +"  "+ProductName[i].length());
			j++;
		}
		
		
		
	}

}
