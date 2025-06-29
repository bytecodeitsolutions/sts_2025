package com.bytecode.beans;

import java.util.List;
import java.util.Set;

public class Customer {
	private String name;
	private long phoneNumber;

	private Account account;// setter and constructor

	private List address;
	
	private Set phoneNumbers;

	public Set getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List getAddress() {
		return address;
	}

	public void setAddress(List address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Customer(String name, long phoneNumber, Account account) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.account = account;
	}

	public Customer() {
		System.out.println("0 param constructor");
	}

	public void checkBalance() {
		System.out.println(name + " Balance in your accountis =" + account.getBalance());
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
