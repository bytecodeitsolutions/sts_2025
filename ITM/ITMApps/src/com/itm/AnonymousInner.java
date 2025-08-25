package com.itm;

interface Greeting {
    void sayHello();
}

public class AnonymousInner {
    public static void main(String[] args) {
        // Anonymous Inner Class
        Greeting g = new Greeting() {
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        g.sayHello();
    }
}

