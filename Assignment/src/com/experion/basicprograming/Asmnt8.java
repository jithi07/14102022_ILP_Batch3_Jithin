package com.experion.basicprograming;

import java.util.Scanner;

public class Asmnt8 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n***** PROGRAM TO CALCULATE THE SUM OF THE SERIES:1/(1^1+1!)+2/(4^2+2!)+3/(9^3+3!)+....n/(n*n^n+n!) *******\n\n");
		Asmnt8 fact = new Asmnt8();
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

			seriesSum = seriesSum + (count / (Math.pow(count * count, count) + factorial(count)));
			// System.out.println(seriesSum);
		}
		System.out.println("Sum of series is:" + seriesSum);
	
}
}


