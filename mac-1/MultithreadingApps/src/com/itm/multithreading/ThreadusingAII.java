package com.itm.multithreading;

public class ThreadusingAII {

	public static void main(String[] args) {
		Runnable t1= new Runnable(){
			@Override
			public void run() {
				System.out.println("Our Thread def-1 "+Thread.currentThread().getName());
			}
		};
		

		Runnable t2= new Runnable(){
			@Override
			public void run() {
				System.out.println("Our Thread def-2 "+Thread.currentThread().getName());
			}
		};
		Thread obj=new Thread(t1);
		obj.start();
	}

}
