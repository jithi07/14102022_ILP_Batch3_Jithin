package com.experion.utility;
import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtility {

	public static void main(String[] args) 
	{

		Product product = Service.createproduct();

		Service.displayProduct(product);
	}

}
