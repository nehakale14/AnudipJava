package com.mystore.model;

import java.util.Scanner;

public class ProductView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		ProductService productService=new ProductService();
		
		for(int i=0;i<3;i++) {
			
			System.out.println("Enter Product id");
			int pid=scanner.nextInt(); 
			scanner.nextLine();
			
			System.out.println("Enter Product name");
			String pname=scanner.nextLine(); 
			
			System.out.println("Enter Product price");
			double price=scanner.nextDouble();
			
			Product product=new Product(pid,pname,price);
			
			productService.setProduct(product);
			
		}
		
		Product productAr[]=productService.getProducts();
		for(Product product:productAr) {
			System.out.println(product.getproductId()+""+product.getproductName()+""+product.getproductPrice());
		}	}
}

	



