package com.itm.multithreading;

class ThreadRunnbale implements Runnable{

	@Override
	public void run() {
		System.out.println("This is our thread");
		
	}
	
}

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		

	}

}

/*
 * ThreadRunnbale  obj=new ThreadRunnbale();
		//obj.start(); CE-Case-1
		Thread  t1=new Thread(obj);
		//t1.start();//Case-2 | Case-3
		//t1.run();//case-4
		//t1.run();//Case-5
		obj.run();//case-6
		System.out.println("main");
 * */
