package com.itm.abstraction;

import java.util.Scanner;

import com.itm.abstraction.factory.PaymentFactory;
import com.itm.contract.Biller;
import com.itm.contract.IPayment;

public class AbstractionDemoApp {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter mode of payment");
		String mode = s1.next();
		System.out.println("Please enter amount to debit");
		double payAmt = s1.nextDouble();
		
		IPayment iPay = PaymentFactory.getPaymentModeObject(mode);
		System.out.println(Biller.getPayement(iPay, payAmt));
		s1.close();
	}

}
