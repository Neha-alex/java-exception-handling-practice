package com.ibm.java.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("input.txt"));
			String line = reader.readLine();
			int num = Integer.parseInt(line);
			int res1 = 100 / num;
			int res2 = 50 / num;
			System.out.println("Two divided numbers: " + "res1: " + res1 + " res2: " + res2);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occured" + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException occured" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occured" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException occured" + e.getMessage());
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
