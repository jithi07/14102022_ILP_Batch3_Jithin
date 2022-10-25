package com.experion.basicprograming;

import java.util.Scanner;

public class Asmnt7 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		Asmnt7 fact = new Asmnt7();
		fact.displaySum();
		
			}
	
	public double factorial(int count1) {
		double factVariable = 1;
		for (int index = 1; index <= count1; index++) {
			factVariable = factVariable * index;
		}
		return factVariable;
	}

	public void displaySum() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range of the series");
		int rangeVariable = scanner.nextInt();

		double seriesSum = 0.0;
		for (int count = 1; count <= rangeVariable; count++) {
		
			seriesSum = seriesSum + (count / factorial(count*count));
			
		}
		System.out.println("Sum of series is:" + seriesSum);
		// TODO Auto-generated method stub

	}
}


