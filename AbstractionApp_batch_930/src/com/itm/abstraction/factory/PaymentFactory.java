package com.itm.abstraction.factory;

import com.itm.contract.IPayment;
import com.itm.contract.impl.CreditCard;
import com.itm.contract.impl.DebitCard;
import com.itm.contract.impl.UPI;

public class PaymentFactory {
	private static IPayment iPayment = null;

	public static IPayment getPaymentModeObject(String mode) {
		if (mode.equalsIgnoreCase("debit")) {
			iPayment = new DebitCard();
		} else if (mode.equalsIgnoreCase("credit")) {
			iPayment = new CreditCard();
		} else if (mode.equalsIgnoreCase("upi")) {
			iPayment = new UPI();
		} else {
			iPayment = null;
		}
		return iPayment;
	}
}
