package com.mystore.model;

public class User {
	
	
	int userId;
	String userName;
	
	User(){
		
	}
	
	User(int userI,String userN)
	{
		int userId=userI;
		String userName=userN;
	}
	
	//Setter method
	public void setuserId(int userI) {
		userId=userI;
	}
	
	public void setuserName(String userN) {
		userName=userN;
	}
	
	//getter method
	
	public int getuserId() {
		return userId;
	}
	
	public String getuserName() {
		return userName;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
