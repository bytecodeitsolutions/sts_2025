package com.bytecode.entity;

public class Customer {
	private String name;
	private String address;
	private long mobileNumber;
	private long adharNumber;
	private String panNumber;
	private int pinNumber;
	private Account account;

	public Customer(String name, String address, long mobileNumber, long adharNumber, String panNumber, int pinNumber,
			Account account) {
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.adharNumber = adharNumber;
		this.panNumber = panNumber;
		this.pinNumber = pinNumber;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public void displayCustomerData(Customer customer) {
		System.out.println(customer.toString());
	}

	public void checkBalance() {
		System.out.println("Hi " + name + " balance in your account number " + account.getAccountNumber() + " is="
				+ account.getAccountBalance());
	}

	public void transferBalance(double amt) {
		double rb = account.getAccountBalance() - amt;
		account.setAccountBalance(rb);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber + ", adharNumber="
				+ adharNumber + ", panNumber=" + panNumber + ", pinNumber=" + pinNumber + "]";
	}

}
