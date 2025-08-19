package com.it.multithreading.synchronization;

public class SynchronizationDemo1 {

	public static void main(String[] args) {
		
		Account a1=new Account();
		//Account a2=new Account();
		
		Runnable r1 = () -> {
			a1.withDraw(15000);
		};
		/*
		 * Runnable r2 = () -> { a2.withDraw(15000); };
		 */
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.setName("husband");
		t2.setName("wife");
		t1.start();
		t2.start();
	}

}
