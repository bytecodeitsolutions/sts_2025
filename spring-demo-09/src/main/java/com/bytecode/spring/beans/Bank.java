package com.bytecode.spring.beans;

public class Bank {
	private String bankName;
	private long tollFreeNumber;
	
	public Bank() {
		System.out.println("0 param");
	}

	public Bank(String bankName, long tollFreeNumber) {
		System.out.println("1 param");
		this.bankName = bankName;
		this.tollFreeNumber = tollFreeNumber;
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", tollFreeNumber=" + tollFreeNumber + "]";
	}

	// value injection-constructor | setter
}
