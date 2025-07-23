package com.bytecode.spring.main;

public class BikeFactory {
	public static Bike buildBike() {
		Bike b1 = new Bike();
		b1.setBikeName("yamaha");
		return b1;
	}
}
