package com.itm.bank;

public class Bank {
	private static int bankId;// data hiding
	private static String bankName;
	private static String bankAddress;
	private static long tollFreeNumber;

	static {
		bankId = 1001;
		bankName = "ITM Bank";
		bankAddress = "Sitholi";
		tollFreeNumber = 1800180L;
	}

	public static int getBankId() {
		return bankId;
	}

	public static void setBankId(int bankId) {
		Bank.bankId = bankId;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	public static String getBankAddress() {
		return bankAddress;
	}

	public static void setBankAddress(String bankAddress) {
		Bank.bankAddress = bankAddress;
	}

	public static long getTollFreeNumber() {
		return tollFreeNumber;
	}

	public static void setTollFreeNumber(long tollFreeNumber) {
		Bank.tollFreeNumber = tollFreeNumber;
	}

}
