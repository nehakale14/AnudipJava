package com.mystore.model;


public class Product {
	int productId;
	String productName;
	double productPrice;
	
	//constructor without parameter
	Product(){	
	}
	
	//constructor with 3 parameter (for all member Variable)
	
	Product(int productI,String productN,double productP)
	{
		productId=productI;
		productName=productN;
		productPrice=productP;
	}
	
	//constructor with 1 parameter
	Product(int productI){
		productId=productI;	
	}
	//constructor with 1 parameter
	Product(String productN){
		
		productName=productN;
	}
	
	//constructor with 1 parameter
	Product(double productP){
		
		productPrice=productP;
	}
	
	//setter method  
	public void setproductId(int productI) {
		
		productId =productI;
	}
	
	public void setproductName(String productN) {
		
		productName =productN;
	}
	
	public void setproductPrice(double productP) {
		
		productPrice =productP;
	}
	
	//getter method
	public int getproductId() {
		return productId;
	}
	
	public String getproductName() {
		return productName;
	}
	
	public double getproductPrice() {
		return productPrice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p=new Product();
		p.setproductId(1);
		p.setproductName("Neha");
		p.setproductPrice(50);
	}

}
