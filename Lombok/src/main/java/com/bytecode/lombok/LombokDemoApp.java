package com.bytecode.lombok;

import com.bytecode.lombok.beans.Customer;

public class LombokDemoApp {

	public static void main(String[] args) {
		Customer c2 = new Customer();
		Customer c1 = new Customer("Raja", 101, 123456789L, 9875656L, "Kanpur");
		System.out.println(c1);
		c1.setCustomerName("Raj Kumar");
		System.out.println(c1.getCustomerName());
		System.out.println(c1);

	}

}
