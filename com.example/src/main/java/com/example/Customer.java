package com.example;

public class Customer {
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
        this.account = account;
    }
    public Customer() {
		System.out.println("cus cont");
	}

    @Override
    public String toString() {
        return "Customer[name=" + name + ", account=" + account + "]";
    }
}
