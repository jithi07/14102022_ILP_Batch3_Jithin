package com.experion.Utility;
import com.experion.service.Service;
import java.util.Scanner;

public class ProductUtility {

	public static void main(String[] args) 
	{

		
		Product product =Services.inpuutProductDetails();
		Service.displayProductDetails(Product product);
		 
		 

	}

}
