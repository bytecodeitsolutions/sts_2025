package com.it.multithreading.synchronization;

public class Account {
	double availAmt = 20000;

	public void withDraw(double reqAmt) {
		System.out.println(this.hashCode());
		/*
		 * Thread ref=Thread.currentThread(); String name=ref.getName();
		 */
		String customerName = Thread.currentThread().getName();
		synchronized (this) {
			if (reqAmt <= availAmt) {
				availAmt = availAmt - reqAmt;
				System.out.println(customerName + " debited amount ::" + reqAmt);
				System.out.println("database updated");
			} else {
				System.out.println("Required amount " + reqAmt + " is not available for  " + customerName);
			}
		}
	}
}
