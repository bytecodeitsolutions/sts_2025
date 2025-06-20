package com.bytecode.utility;

import com.bytecode.entity.Customer;
import com.bytecode.exception.InvalidCustomerException;

public class CustomerVerification {
	public static boolean verifyCustomer(Customer customer, int pin) throws InvalidCustomerException{
		if (customer.getPinNumber() == pin) {
			return true;
		} else {
			throw new InvalidCustomerException("Customer not found in database");
		}

	}
}
