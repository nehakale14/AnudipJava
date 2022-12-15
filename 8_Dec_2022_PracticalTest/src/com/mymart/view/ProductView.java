package com.mymart.view;
import com.mymart.model.Product;
import com.mymart.service.ProductService;

import java.util.LinkedList;

import com.mymart.view;
import com.mymart.model.Product;

public class ProductView {
	
	private static ProductService productService = new ProductService();
			
			public void addProduct()
			{
				int productId=1;
				String productName= "Samsung Speaker";
				double productPrice = 34.5;
				
				Product product= new Product(productId,productName,productPrice);
						
			}
			
			public void displayAllProduct()
			{
				LinkedList<Product> product =productService.getAllProductsServices();
				for(Product p:product)
				{
					System.out.println("Product Details");
					System.out.println("Product ID"+p.getProductId());
					System.out.println("Product ID"+p.getProductName());
					System.out.println("Product ID"+p.getProductPrice());
					
				}
			}

}
