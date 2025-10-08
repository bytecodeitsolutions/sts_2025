package com.bytecode.oops;

class Parent3{
	
}
class Child1 extends Parent3{
	
}

class Child2 extends Child1{
	
}

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Parent3 p1=new Child2();
		Child2  c2=(Child2)p1;
		Child1  c4=(Child2)p1;
		Child1  c3=(Child1)p1;
		Child2 x=(Child2)c4;
		System.out.println("hello");
	}

}
