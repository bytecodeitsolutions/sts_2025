package com.itm.bank.entity;

public class Customer {
	private int cId;
	private String cName;
	private String cAddress;
	private long contactNumber;
	private Account account;

	public Customer(int cId, String cName, String cAddress, long contactNumber) {
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
		this.contactNumber = contactNumber;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cAddress=" + cAddress + ", contactNumber="
				+ contactNumber + ", account=" + account + "]";
	}
}
