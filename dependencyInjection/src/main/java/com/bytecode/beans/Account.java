package com.bytecode.beans;

public class Account {
	private long accountNumber;
	private double balance;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		System.out.println("setAccountNumber() method executed");
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		System.out.println("setBalance() method executed");
		this.balance = balance;
	}
}
