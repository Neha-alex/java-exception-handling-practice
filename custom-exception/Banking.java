package com.ibm.java.exceptions;

public class Banking {

	public static void main(String[] args) {
		int balance = 500;
		try {
			balance = withdraw(balance, 500);
			System.out.println("Balance after withdrawl: " + balance);
		} catch (InsufficientBalanceException e) {
			System.out.println("Transaction failed: " + e.getMessage());
		}
	}

	private static int withdraw(int balance, int amount) {

		if (balance <= amount) {
			throw new InsufficientBalanceException("Bank balance is not sufficient");
		} else {
			return balance - amount;
		}
	}
}
