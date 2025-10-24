package com.bytecode.oops.constructor;

class Test{
	
	int   a;
	int   b;
	
	public Test(int a, int b) {
		this.a = this.a;
		this.b = this.b;
	}

	void printA_B(){
		System.out.println(hashCode() +" =>"+a+"  "+b);
	}
}

public class ConsDemo1 {

	public static void main(String[] args) {
		Test test1 = new Test(10,20);
		Test test2 = new Test(1,2);
		System.out.println(test1.hashCode());
		System.out.println(test2.hashCode());
		test1.printA_B();
		test2.printA_B();
	}

}

/*
 * 
 * Default Constructor:
 * ---------------------
 * 
 * this
 * super
 * 
 * */
 