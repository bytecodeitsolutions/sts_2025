package com.itm.contract;

public class Biller {
	public static String getPayement(IPayment ipayment, double amt) {
         System.out.println(ipayment.getClass().getName());
		return ipayment.pay(amt);
	}
}
