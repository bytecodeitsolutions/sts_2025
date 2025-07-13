package com.bytecode.spring.beans;

import org.springframework.stereotype.Component;


public class C {
	public C() {
		System.out.println("C class 0 param constructor");
	}
	
	public void m2(){
		System.out.println("I am from C");
	}
}
