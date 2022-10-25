package com.experion.basicprograming;

import java.util.Scanner;

public class Asmnt4 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Limit:");
		int range = scanner.nextInt();
		int Number1 = 1;
		int Number2 = 2;
		int Number3 = Number1 + Number2;
		double Sum = 0;
		Sum = Math.pow(Number1, 3) + Math.pow(Number2, 3);
		for (int count = 3; count <= range; count++) {
			Number1 = Number2;
			Number2 = Number3;
			Number3 = Number1 + Number2;
			Sum = Sum + Math.pow(Number2, 3);

		}

		System.out.println("Series sum:" + Sum);
		
		
			}
}


