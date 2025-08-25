package com.itm;

class Outer {
	private String msg = "Hello from Outer class";

	// Inner class
	class Inner {
		void display() {
			System.out.println("Message: " + msg); // Accessing outer class private variable
		}
	}
}

public class NonStaticInner {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); // Create inner class object
		inner.display();
	}
}
