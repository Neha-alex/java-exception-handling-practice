package com.ibm.java.exceptions;

import java.util.Scanner;

public class ParseInput {
	
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		try {
			int num = Integer.parseInt(input);
			System.out.println("Number you entered "+ num);
		}catch(NumberFormatException e){
			System.out.println("Invalid number entered "+ e.getMessage());			
		}finally {
			scanner.close();
			System.out.println("Scanner closed");
		}
	}

}
