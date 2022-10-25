package com.experion.basicprograming;

import java.util.Scanner;

public class Asmnt5 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Limit:");
		int rangeVariable = scanner.nextInt();
		int value = 1;
		int location = 1;
		double Sum = 0;
		for (int count = 1; count <= value; count++) {
			if (location % 2 == 0)
				Sum = Sum - Math.pow(value, count);
			else
				Sum = Sum + Math.pow(value, count);
			value += 2;
			location += 1;

		}
		System.out.println("Sum of series is:" + Sum);
		
		
			}
}


