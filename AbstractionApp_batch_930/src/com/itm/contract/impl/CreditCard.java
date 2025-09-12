package com.itm.contract.impl;

import com.itm.contract.IPayment;

public class CreditCard implements IPayment{

	@Override
	public String pay(double amt) {
		
		return "payment of rs "+amt +"  done using creditcard";
	}

}
//Parent  p1=new Child();
//IPayment i=new CreditCard();
//i.pay();
//p1.m1(); if overriding is there