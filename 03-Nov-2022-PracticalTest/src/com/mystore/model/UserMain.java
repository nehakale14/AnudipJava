package com.mystore.model;

import java.util.Scanner;
public class UserMain {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ID");
		int id=sc.nextInt();
	
		sc.nextLine();
		
		System.out.println("Name");
		String name=sc.nextLine();
		
		System.out.println(id+""+name);
		
		
		User userObj=new User();
		userObj.setuserId(id);
		userObj.setuserName(name);
		UserArray[i]=userObj;
	}
		
		System.out.Println(userArray[2]);
		for(User u:userArray)
			System.out.println(u.getId()+""+u.getUserName());
		
		


	

}
