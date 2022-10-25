package com.experion.basicprograming;

import java.util.Scanner;

public class Asmnt9 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(
				"\n***** PROGRAM TO PRINT THE PATTERN:*******\n1\n1\t2\n1\t2\t3\t\n1\t2\t3\t4 \n\n");

		int rangeVariable;
		
		System.out.println("Enter range");
		rangeVariable = scanner.nextInt();
		for (int row = 1; row <= rangeVariable; row++) {
			for (int value = 1; value <= row; value++) {
				System.out.print(value + "  ");
			}
			System.out.println();
		}
		
		
		
		
			}
}


