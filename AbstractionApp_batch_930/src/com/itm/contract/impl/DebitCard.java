package com.itm.contract.impl;

import com.itm.contract.IPayment;

public class DebitCard implements IPayment{

	@Override
	public String pay(double amt) {
		return "payment of rs "+amt +"  done using debitcard";
	}

}
