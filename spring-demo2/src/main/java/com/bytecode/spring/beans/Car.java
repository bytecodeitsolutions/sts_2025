package com.bytecode.spring.beans;

public class Car {
	private Engine engine;

	public Car(Engine engine) {
		this.engine=engine;
		System.out.println("sone ka mala");
	}

	public void move() {
		engine.start();
		System.out.println("car is moving");
	}
}
