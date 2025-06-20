package com.bytecode.spring.beans;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("car created");
	}

	public void move() {
		engine.start();
		System.out.println("car is moving");
	}
}
