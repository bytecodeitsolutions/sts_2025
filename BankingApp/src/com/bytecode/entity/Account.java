package com.bytecode.entity;

public class Account {
	private long accountNumber;
	private double accountBalance;
	private int accountId;

	public Account(long accountNumber, double accountBalance, int accountId) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance + ", accountId="
				+ accountId + "]";
	}
}
