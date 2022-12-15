package com.mymart.dao;
import java.util.LinkedList;
import com.mymart.model.Product;

public class ProductDAO {
	
	private static LinkedList<Product> List = new LinkedList<>();
	
	public boolean addProduct(Product product)
	{
		boolean addStatus = false;
		List.add(product);
		addStatus=true;
		
	
	return addStatus;
	}

	public LinkedList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
