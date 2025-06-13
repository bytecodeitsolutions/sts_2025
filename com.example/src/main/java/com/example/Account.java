package com.example;

import org.springframework.core.env.CommandLinePropertySource;

public class Account {
	
	
    private String accNumber;
    private double balance;

     public Account() {
		System.out.println("0 param constructopr");
	}
    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account[accNumber=" + accNumber + ", balance=" + balance + "]";
    }
}
