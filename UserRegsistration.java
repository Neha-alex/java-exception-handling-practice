package com.ibm.java.exceptions;

public class UserRegsistration {
	
	public static void main(String[] args) {
		try {
			registerUser("neh");
		}catch(IllegalArgumentException e) {
			System.out.println("Username is not valid "+ e.getMessage());
		}
	}
	
	private static void registerUser(String user) {
		System.out.println("Validating User: "+user );
		validateUser(user);
		System.out.println("User registered successfully!");
	}
	
	private static void validateUser(String user) throws IllegalArgumentException{
		if(user.length()<4) {
			throw new IllegalArgumentException("Username must be at least 4 characters long.");		
		}
	}

}
