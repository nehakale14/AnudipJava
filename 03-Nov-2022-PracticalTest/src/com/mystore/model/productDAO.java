package com.mystore.model;

public class productDAO {
	
	
	Product productArr[]= new Product [3];
	
	public void setProduct(Product product) {
		for(int i=0;i<productArr.length;i++) {
			System.out.println("for loop");
			
			
			
			
			if(productArr[i]!=null) {
				System.out.println("if");
				
				productArr[i]=product;
				System.out.println(productArr[i]);
				break;
			}
		}
			}
	
	
	public Product[] getProducts() {
		return productArr;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}

}
