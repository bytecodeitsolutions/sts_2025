package com.itm.multithreading;

class ThreadDemo1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("murder of X="+Thread.currentThread().getName());
		}
	}	
}
public class ThreadIntroDemo1 {
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("Atul");
		ThreadDemo1 obj=new ThreadDemo1();
		Thread  t1=new Thread(obj);
		obj.setName("Ojha");
		t1.start();
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("murder of Y="+Thread.currentThread().getName());
		}
	}

}
/*
 *     Case-1:
 *     Case-2:
 * */
