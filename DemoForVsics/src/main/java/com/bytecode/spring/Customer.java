package com.bytecode.spring;

public class Customer {

	public Customer() {
		System.out.println("Customer class constructor");
	}

	private String name;

	private Account account;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		//System.out.println("hello");
		this.account = account;
	}

	public void checkBalance() {

		System.out.println(hashCode() +"Hey " + name + " balance in your acc is=" + account.getBalance());
	}
}
