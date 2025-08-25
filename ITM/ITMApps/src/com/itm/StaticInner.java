package com.itm;

class Outer1 {
    static String msg = "Hello from Outer class";

    // Static Nested Class
    static class Inner {
        void display() {
            System.out.println("Message: " + msg); // Access only static
        }
    }
}

public class StaticInner {
    public static void main(String[] args) {
        Outer1.Inner inner = new Outer1.Inner(); // No need for outer object
        inner.display();
    }
}
