package com.experion;

import java.util.Scanner;

public class WeekValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the day:");
		
		
		int date=scanner.nextInt();
		switch(date)
		{
		case 1: System.out.println("Today Is Sunday ");
		             break;
		case 2: System.out.println("Today Is Monday ");
        break;
		case 3: System.out.println("Today Is Tuesday ");
        break;
		case 4: System.out.println("Today Is Wednsday ");
        break;
		case 5: System.out.println("Today Is Thursday ");
        break;
		case 6: System.out.println("Today Is Fridayday ");
        break;
		case 7: System.out.println("Today Is Saturday ");
        break;
        
		             
		
        default:  System.out.println("please enter A valid input ");
        break;
		}
	}

}
