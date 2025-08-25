package com.itm;

class Outer2 {
    void outerMethod() {
        int num = 10; // effectively final

        // Local Inner Class
        class Inner {
            void display() {
                System.out.println("Number: " + num);
            }
        }

        Inner inner = new Inner();
        inner.display();
    }
}

public class LocalInner {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.outerMethod();
    }
}

