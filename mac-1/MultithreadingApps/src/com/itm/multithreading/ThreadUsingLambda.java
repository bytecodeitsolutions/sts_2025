package com.itm.multithreading;

public class ThreadUsingLambda {

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("our thread " + Thread.currentThread().getName());

		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> System.out.println("our thread " + Thread.currentThread().getName());

		Thread t2 = new Thread(r2);
		t2.start();

	}

}
