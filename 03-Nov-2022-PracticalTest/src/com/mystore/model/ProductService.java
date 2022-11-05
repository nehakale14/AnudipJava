package com.mystore.model;

public class ProductService {
	productDAO productDAO;
	
	public ProductService() {
		productDAO=new productDAO();
			
		}
		
		public void setProduct(Product product) {
			
			productDAO.setProduct(product);
			
		}
		
		public Product[] getProducts() {
			Product productArr[]=productDAO.getProducts();
			return productArr;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
