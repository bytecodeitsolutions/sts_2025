package com.itm.multithreading;
/*
 *   Synchronization:
 *   ----------------
 *   
 *   
 * */

class MyThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
             System.out.println("joined main thread");
             try {
				SynchronizationDemo.ref.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class SynchronizationDemo {

	static Thread ref;

	public static void main(String[] args) {
		ref = Thread.currentThread();
		System.out.println(ref.getName());
		
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}

}
