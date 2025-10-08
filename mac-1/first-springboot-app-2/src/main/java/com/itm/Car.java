package com.itm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	
	@Value("Fortune Legender")
	private String carName;
	
	public Car() {
		System.out.println("Car 0 param constructor");
	}
	
	public void move() {
		engine.start();
		System.out.println(carName +"car is moving");
	}
}
