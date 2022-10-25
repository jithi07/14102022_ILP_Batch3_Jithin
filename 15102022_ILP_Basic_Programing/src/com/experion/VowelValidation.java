package com.experion;

import java.util.Scanner;

public class VowelValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		
		
		char Alphabet=scanner.next().charAt(0);
		switch(Alphabet)
		{
		case 'a': System.out.println("The Alphabet Is A Vowel ");
		             break;
		             
		case 'e': System.out.println("The Alphabet Is A Vowel ");
                     break;	
		case 'i': System.out.println("The Alphabet Is A Vowel ");
	
                     break;
		case 'o': System.out.println("The Alphabet Is A Vowel ");
                      break;
		case 'u': System.out.println("The Alphabet Is A Vowel ");
                      break;
		case 'A': System.out.println("The Alphabet Is A Vowel ");
                       break;
		case 'E': System.out.println("The Alphabet Is A Vowel ");
                       break;
		case 'I': System.out.println("The Alphabet Is A Vowel ");
                       break;
		case 'O': System.out.println("The Alphabet Is A Vowel ");
                       break;
		case 'U': System.out.println("The Alphabet Is A Vowel ");
                       break;
        default:  System.out.println("The Alphabet Is Not Aa Vowel ");
        break;
		}
	}

}
