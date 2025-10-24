package com.itm.multithreading;

public class ThreadUsingAIC {

	public static void main(String[] args) {
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				System.out.println("Our Thread def-1 "+Thread.currentThread().getName());
			}
		};
		

		Thread t2=new Thread() {
			@Override
			public void run() {
				System.out.println("Our Thread def-2 "+Thread.currentThread().getName());
			}
		};
		

		Thread t3=new Thread() {
			@Override
			public void run() {
				System.out.println("Our Thread def-3 " +Thread.currentThread().getName());
			}
		};

      t1.start();
      t2.start();
      t3.start();
      
      System.out.println(t1.getClass().getName());
      

	}

}
