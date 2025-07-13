package com.bytecode.spring.beans;

import org.springframework.stereotype.Component;


public class B {
	public B() {
		System.out.println("b class 0 param constructor");
	}
	
	public void m1(){
		System.out.println("I am from B");
	}
}
