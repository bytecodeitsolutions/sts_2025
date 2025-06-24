package com.bytecode.spring;

public class Account {
	
	public Account() {
		System.out.println("Account class constructor");
	}
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
