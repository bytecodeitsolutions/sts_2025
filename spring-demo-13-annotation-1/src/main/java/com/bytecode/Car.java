package com.bytecode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bytecode1.MotorEngine;

@Component
public class Car {

	@Autowired
	private Engine engine;
	@Autowired
	private MotorEngine engine2;

	public void move() {
		engine.start();
		System.out.println("Car is moving");
		engine2.start();
	}
}
