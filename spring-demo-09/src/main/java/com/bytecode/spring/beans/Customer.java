package com.bytecode.spring.beans;

public class Customer {
	private Bank bank1;

	private String customerName;
	private long cusPhoneNumber;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	
	  public Customer(Bank bank1) {
	  
	  this.bank1 = bank1; }
	 

	public Bank getBank1() {
		return bank1;
	}

	public void setBank1(Bank bank1) {
		this.bank1 = bank1;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCusPhoneNumber() {
		return cusPhoneNumber;
	}

	public void setCusPhoneNumber(long cusPhoneNumber) {
		this.cusPhoneNumber = cusPhoneNumber;
	}

	public void displayAllData() {
		System.out.println("Bank details=" + bank1.toString());
		System.out.println("Customer Name=" + customerName + " Customer Contact Number=" + cusPhoneNumber);
	}
}
