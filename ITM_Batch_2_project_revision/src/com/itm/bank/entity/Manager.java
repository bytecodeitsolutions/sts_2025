package com.itm.bank.entity;

public class Manager {
	private int mId;
	private String mName;
	private long contactNumber;
	private String emailId;
	private Customer customer;

	public Manager(int mId, String mName, long contactNumber, String emailId) {
		this.mId = mId;
		this.mName = mName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", mName=" + mName + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ ", customer=" + customer + "]";
	}
}
