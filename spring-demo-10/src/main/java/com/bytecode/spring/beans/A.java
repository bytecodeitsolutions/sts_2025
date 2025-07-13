package com.bytecode.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	private B b;
	
	private C c;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		System.out.println("b setter");
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		System.out.println("c setter");
		this.c = c;
	}

	public A() {
		System.out.println("0 param constructor from A");
	}

	public void check() {
		System.out.println("hello check");
		b.m1();
		c.m2();
	}
}
