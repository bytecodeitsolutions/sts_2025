package com.bytecode.multithreading;

class ThreadTest1 extends Thread{
	@Override
	public void run() {
		m1();
		System.out.println("run:: "+Thread.currentThread().getName());
	}
	
	void m1() {
		m2();
		System.out.println("m1 ::"+Thread.currentThread().getName());
	}
	
	void  m2() {
		System.out.println("m2 ::"+Thread.currentThread().getName());
	}
	
	void m3() {
		System.out.println("m3 "+Thread.currentThread().getName());
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		ThreadTest1 t1=new ThreadTest1();
		t1.start();
		t1.m3();
		t1.m2();
		ThreadTest1 t2=new ThreadTest1();
		t2.start();
		System.out.println("main:: "+Thread.currentThread().getName());
	}

}
