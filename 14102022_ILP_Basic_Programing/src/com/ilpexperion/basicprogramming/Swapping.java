package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num1,num2,num3;
 Scanner scanner= new Scanner(System.in); 
 System.out.println("Enter the First Number:");
 num1 = scanner.nextInt();
 System.out.println("Enter the Second Number:");
 num2 = scanner.nextInt();
 System.out.println("......Numbers Before Swapping......");
 System.out.println("First Number:"+num1);
 System.out.println("Second Number:"+num2);
 System.out.println("........ Number After Swapping.......");
 num3 = num1;
 num1 = num2;
 num2 = num3;
 System.out.println("First Number:"+num1);
 System.out.println("Second Number:"+num2);
	}

}
