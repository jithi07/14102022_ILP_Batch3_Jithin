package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class Secondsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num1,num2,num3;
 Scanner scanner= new Scanner(System.in); 
 System.out.println("Enter the First Number:");
 num1 = scanner.nextInt();
 System.out.println("Enter the Second Number:");
 num2 = scanner.nextInt();
 System.out.println("Enter the Third Number:");
 num3 = scanner.nextInt();

 if((num1>num2)&&(num1>num3))
 {
	 if(num2>num3)
	 {
		 System.out.println("Second Smallest:"+num2);
	 }
	 else
	 {
		 System.out.println("Second Smallest:"+num3);
	 }
	 
 }

 else if((num2>num3)&&(num2>num1))
 {
	 if(num3>num1)
	 {
		 System.out.println("Second Smallest:"+num3);
	 }
	 else
	 {
		 System.out.println("Second Smallest:"+num1);
	 }
 }
 else if((num3>num1)&&(num3>num2))
 {
	 if(num1>num2)
	 {
		 System.out.println("Second Smallest:"+num1);
	 }
	 else
	 {
		 System.out.println("Second Smallest:"+num2);
	 }
 }
 else
 {
	 System.out.println("All Numbers are Equal");
 }
 }
 
	}

