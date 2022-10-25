package com.experion.basicprograming;

import java.util.Scanner;

public class Asmnt1 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		int number3=scanner.nextInt();

		System.out.println("The Numbers Before sorting are :\n");
		System.out.println(number1 + "\t" + number2 + "\t" + number3);
		System.out.println("\n");
		if (number1 > number2 && number1 > number3) 
		{
			if (number2 > number3) 
			{
				System.out.println("Numbers in Decentorder"+number1+"\t"+number2+"\t"+number3);
			} 
			else  
			{
				System.out.println("Numbers in Decentorder:\t"+number1+"\t"+number3+"\t"+number2);
			}
		
		}
		else if (number2 > number1 && number2 > number3) 
		{
			if (number1 > number3) 
			{
				System.out.println("Numbers in Decentorder"+number2+"\t"+number1+"\t"+number3);
			} 
			else  
			{
				System.out.println("Numbers in Decentorder"+number2+"\t"+number3+"\t"+number1);
			}
		}
			else if (number3 > number2 && number3 > number1) 
			{
				if (number2 > number1) 
				{
					System.out.println("Numbers in Decentorder"+number3+"\t"+number2+"\t"+number1);
				} 
				else  
				{
					System.out.println("Numbers in Decentorder"+number3+"\t"+number1+"\t"+number2);
				}
			
			}
		
		
	}
}


