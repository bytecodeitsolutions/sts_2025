package com.itm.bank.entity;

public class Account {
	private int accountId;
	private long accountNumber;
	private double balance;

	public Account(int accountId, long accountNumber, double balance) {
		this.accountId = accountId;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
}
