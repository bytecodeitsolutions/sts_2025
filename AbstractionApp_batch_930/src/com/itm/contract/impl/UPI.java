package com.itm.contract.impl;

import com.itm.contract.IPayment;

public class UPI implements IPayment{

	@Override
	public String pay(double amt) {
		
		return "payment of rs "+amt +"  done using upi";
	}

}
